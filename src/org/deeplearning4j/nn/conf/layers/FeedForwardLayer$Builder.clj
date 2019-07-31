(ns org.deeplearning4j.nn.conf.layers.FeedForwardLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers FeedForwardLayer$Builder]))

(defn ->builder
  "Constructor."
  (^FeedForwardLayer$Builder []
    (new FeedForwardLayer$Builder )))

(defn n-in
  "Number of inputs for the layer (usually the size of the last layer).
  Note that for Convolutional layers, this is the input channels, otherwise is the previous layer size.

  n-in - Number of inputs for the layer - `int`

  returns: `T`"
  ([^FeedForwardLayer$Builder this ^Integer n-in]
    (-> this (.nIn n-in))))

(defn n-out
  "Number of outputs - used to set the layer size (number of units/nodes for the current layer).
  Note that this is equivalent to units(int)

  n-out - Number of outputs / layer size - `int`

  returns: `T`"
  ([^FeedForwardLayer$Builder this ^Integer n-out]
    (-> this (.nOut n-out))))

(defn units
  "Set the number of units / layer size for this layer.
  This is equivalent to nOut(int)

  units - Size of the layer (number of units) / nOut - `int`

  returns: `T`"
  ([^FeedForwardLayer$Builder this ^Integer units]
    (-> this (.units units))))

