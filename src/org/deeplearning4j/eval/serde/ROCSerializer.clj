(ns org.deeplearning4j.eval.serde.ROCSerializer
  "Custom Jackson serializer for ROC.
 This is necessary to force calculation of the AUC and AUPRC metrics, so said metrics can be stored in the JSON;
 this is important for exact ROC, as if it's not present at the time of serialization, it cannot be calculated later,
 due to the underlying (very large) predictions no longer being present."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval.serde ROCSerializer]))

(defn ->roc-serializer
  "Constructor."
  (^ROCSerializer []
    (new ROCSerializer )))

(defn serialize
  "roc - `org.deeplearning4j.eval.ROC`
  json-generator - `org.nd4j.shade.jackson.core.JsonGenerator`
  serializer-provider - `org.nd4j.shade.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^ROCSerializer this ^org.deeplearning4j.eval.ROC roc ^org.nd4j.shade.jackson.core.JsonGenerator json-generator ^org.nd4j.shade.jackson.databind.SerializerProvider serializer-provider]
    (-> this (.serialize roc json-generator serializer-provider))))

(defn serialize-with-type
  "value - `org.deeplearning4j.eval.ROC`
  gen - `org.nd4j.shade.jackson.core.JsonGenerator`
  serializers - `org.nd4j.shade.jackson.databind.SerializerProvider`
  type-ser - `org.nd4j.shade.jackson.databind.jsontype.TypeSerializer`

  throws: java.io.IOException"
  ([^ROCSerializer this ^org.deeplearning4j.eval.ROC value ^org.nd4j.shade.jackson.core.JsonGenerator gen ^org.nd4j.shade.jackson.databind.SerializerProvider serializers ^org.nd4j.shade.jackson.databind.jsontype.TypeSerializer type-ser]
    (-> this (.serializeWithType value gen serializers type-ser))))

