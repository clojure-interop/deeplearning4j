(ns org.deeplearning4j.nn.conf.layers.PReLULayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers PReLULayer$Builder]))

(defn ->builder
  "Constructor."
  (^PReLULayer$Builder []
    (new PReLULayer$Builder )))

(defn input-shape
  "Explicitly set input shape of incoming activations so that parameters
  can be initialized properly. This explicitly excludes the mini-batch
  dimension.

  shape - shape of input data - `long`

  returns: `org.deeplearning4j.nn.conf.layers.PReLULayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.PReLULayer$Builder [^PReLULayer$Builder this ^Long shape]
    (-> this (.inputShape shape))))

(defn shared-axes
  "Set the broadcasting axes of PReLU's alpha parameter.
  For instance, given input data of shape
  [mb, channels, height, width], setting axes to [2,3] will
  set alpha to shape [channels, 1, 1] and broadcast alpha across
  height and width dimensions of each channel.

  axes - shared/broadcasting axes - `long`

  returns: Builder - `org.deeplearning4j.nn.conf.layers.PReLULayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.PReLULayer$Builder [^PReLULayer$Builder this ^Long axes]
    (-> this (.sharedAxes axes))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.PReLULayer`"
  (^org.deeplearning4j.nn.conf.layers.PReLULayer [^PReLULayer$Builder this]
    (-> this (.build))))

