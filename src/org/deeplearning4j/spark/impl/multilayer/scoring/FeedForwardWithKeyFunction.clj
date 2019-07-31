(ns org.deeplearning4j.spark.impl.multilayer.scoring.FeedForwardWithKeyFunction
  "Function to feed-forward examples, and get the network output (for example, class probabilities).
 A key value is used to keep track of which output corresponds to which input."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.multilayer.scoring FeedForwardWithKeyFunction]))

(defn ->feed-forward-with-key-function
  "Constructor.

  params - `org.apache.spark.broadcast.Broadcast`
  json-config - `org.apache.spark.broadcast.Broadcast`
  batch-size - `int`"
  (^FeedForwardWithKeyFunction [^org.apache.spark.broadcast.Broadcast params ^org.apache.spark.broadcast.Broadcast json-config ^Integer batch-size]
    (new FeedForwardWithKeyFunction params json-config batch-size)))

