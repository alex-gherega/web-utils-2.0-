;;; This namespace is used for testing purpose. It use the
;;; clojurescript.test lib.
(ns micselaneous.core-test
  (:require-macros [cemerick.cljs.test :as m :refer (deftest is)]
                   ;[miscelaneous.core :as mics]
                   )
  (:require [cemerick.cljs.test :as t]
            [miscelaneous.core :as misc]))
