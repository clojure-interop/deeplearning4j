(ns org.nd4j.parameterserver.distributed.messages.intercom.DistributedAssignMessage
  "Assign target row to specified value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.intercom DistributedAssignMessage]))

(defn ->distributed-assign-message
  "Constructor.

  key - `java.lang.Integer`
  index - `int`
  value - `double`"
  (^DistributedAssignMessage [^java.lang.Integer key ^Integer index ^Double value]
    (new DistributedAssignMessage key index value))
  (^DistributedAssignMessage [^java.lang.Integer key ^org.nd4j.linalg.api.ndarray.INDArray payload]
    (new DistributedAssignMessage key payload)))

(defn process-message
  "This method assigns specific value to either specific row, or whole array.
  Array is identified by key"
  ([^DistributedAssignMessage this]
    (-> this (.processMessage))))

