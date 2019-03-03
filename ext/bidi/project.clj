;; Copyright © 2014-2017, JUXT LTD.

(def VERSION "1.3.0-alpha8-SNAPSHOT")

(defproject yada/bidi VERSION
  :description "bidi integration with yada"
  :license {:name "The MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :pedantic? :abort
  :dependencies [[yada/core ~VERSION]
                 [bidi "2.0.16"]])
