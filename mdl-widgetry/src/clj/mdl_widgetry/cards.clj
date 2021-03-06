(ns mdl-widgetry.cards
  (:require [clojure.string :as cstring]
            [miscelaneous.core :as misc]
            [clojure.java.io :as io]))

(defn- read-all [rdr]
  (loop [forms []]
    (let [f (read rdr false :eof)]
      (if (= :eof f)
          forms
          (recur (conj forms f))))))
          
; Read contents from the runtime .cljs file
; (a workaround for not being able to require a file with .cljs extensions in Clojure).
(with-open [rt  (-> "mdl_widgetry/cards.cljs" io/resource io/reader (java.io.PushbackReader.))]
  (->> (rest (read-all rt))
       (map eval)
       dorun))

