(ns org.nd4j.serde.gson.GsonDeserializationUtils
  "Gson serialization"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.serde.gson GsonDeserializationUtils]))

(defn ->gson-deserialization-utils
  "Constructor."
  (^GsonDeserializationUtils []
    (new GsonDeserializationUtils )))

(defn *deserialize-raw-json
  "Deserialize an ndarray
  form json

  serialized-raw-array - `java.lang.String`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^java.lang.String serialized-raw-array]
    (GsonDeserializationUtils/deserializeRawJson serialized-raw-array)))

