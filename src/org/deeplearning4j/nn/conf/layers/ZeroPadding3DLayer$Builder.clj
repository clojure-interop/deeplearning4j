(ns org.deeplearning4j.nn.conf.layers.ZeroPadding3DLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers ZeroPadding3DLayer$Builder]))

(defn ->builder
  "Constructor.

  Explicit padding of left and right boundaries in depth, height and width dimensions

  pad-left-d - Depth padding left - `int`
  pad-right-d - Depth padding right - `int`
  pad-left-h - Height padding left - `int`
  pad-right-h - Height padding right - `int`
  pad-left-w - Width padding left - `int`
  pad-right-w - Width padding right - `int`"
  (^ZeroPadding3DLayer$Builder [^Integer pad-left-d ^Integer pad-right-d ^Integer pad-left-h ^Integer pad-right-h ^Integer pad-left-w ^Integer pad-right-w]
    (new ZeroPadding3DLayer$Builder pad-left-d pad-right-d pad-left-h pad-right-h pad-left-w pad-right-w))
  (^ZeroPadding3DLayer$Builder [^Integer pad-depth ^Integer pad-height ^Integer pad-width]
    (new ZeroPadding3DLayer$Builder pad-depth pad-height pad-width))
  (^ZeroPadding3DLayer$Builder [^Integer padding]
    (new ZeroPadding3DLayer$Builder padding)))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.ZeroPadding3DLayer`"
  (^org.deeplearning4j.nn.conf.layers.ZeroPadding3DLayer [^ZeroPadding3DLayer$Builder this]
    (-> this (.build))))

