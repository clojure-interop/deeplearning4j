(ns org.deeplearning4j.nn.conf.layers.ZeroPadding1DLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers ZeroPadding1DLayer$Builder]))

(defn ->builder
  "Constructor.

  pad-left - `int`
  pad-right - `int`"
  (^ZeroPadding1DLayer$Builder [^Integer pad-left ^Integer pad-right]
    (new ZeroPadding1DLayer$Builder pad-left pad-right))
  (^ZeroPadding1DLayer$Builder [^Integer padding]
    (new ZeroPadding1DLayer$Builder padding)))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.ZeroPadding1DLayer`"
  (^org.deeplearning4j.nn.conf.layers.ZeroPadding1DLayer [^ZeroPadding1DLayer$Builder this]
    (-> this (.build))))

