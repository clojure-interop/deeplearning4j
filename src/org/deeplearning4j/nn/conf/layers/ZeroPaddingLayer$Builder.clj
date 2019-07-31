(ns org.deeplearning4j.nn.conf.layers.ZeroPaddingLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers ZeroPaddingLayer$Builder]))

(defn ->builder
  "Constructor.

  pad-top - `int`
  pad-bottom - `int`
  pad-left - `int`
  pad-right - `int`"
  (^ZeroPaddingLayer$Builder [^Integer pad-top ^Integer pad-bottom ^Integer pad-left ^Integer pad-right]
    (new ZeroPaddingLayer$Builder pad-top pad-bottom pad-left pad-right))
  (^ZeroPaddingLayer$Builder [^Integer pad-height ^Integer pad-width]
    (new ZeroPaddingLayer$Builder pad-height pad-width))
  (^ZeroPaddingLayer$Builder [padding]
    (new ZeroPaddingLayer$Builder padding)))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.ZeroPaddingLayer`"
  (^org.deeplearning4j.nn.conf.layers.ZeroPaddingLayer [^ZeroPaddingLayer$Builder this]
    (-> this (.build))))

