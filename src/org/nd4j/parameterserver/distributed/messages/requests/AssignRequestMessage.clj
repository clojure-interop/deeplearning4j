(ns org.nd4j.parameterserver.distributed.messages.requests.AssignRequestMessage
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.distributed.messages.requests AssignRequestMessage]))

(defn ->assign-request-message
  "Constructor.

  key - `java.lang.Integer`
  value - `java.lang.Number`
  row-idx - `int`"
  (^AssignRequestMessage [^java.lang.Integer key ^java.lang.Number value ^Integer row-idx]
    (new AssignRequestMessage key value row-idx))
  (^AssignRequestMessage [^java.lang.Integer key ^org.nd4j.linalg.api.ndarray.INDArray array]
    (new AssignRequestMessage key array)))

(defn process-message
  "Description copied from interface: VoidMessage"
  ([^AssignRequestMessage this]
    (-> this (.processMessage))))

