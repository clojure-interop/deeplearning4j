(ns org.deeplearning4j.spark.models.sequencevectors.primitives.ExtraCounter
  "This class serves as Counter for SparkSequenceVectors vocab creation  for distributed parameters server organization
 Ip addresses extracted here will be used for ParamServer shards selection, and won't be used for anything else"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.primitives ExtraCounter]))

(defn ->extra-counter
  "Constructor."
  (^ExtraCounter []
    (new ExtraCounter )))

(defn build-network-snapshot
  ""
  ([^ExtraCounter this]
    (-> this (.buildNetworkSnapshot))))

(defn increment-all
  "Description copied from class: Counter

  counter - `org.nd4j.linalg.primitives.Counter`

  returns: `<T extends E> void`"
  ([^ExtraCounter this ^org.nd4j.linalg.primitives.Counter counter]
    (-> this (.incrementAll counter))))

