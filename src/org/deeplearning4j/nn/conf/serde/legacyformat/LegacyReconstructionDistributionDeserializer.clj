(ns org.deeplearning4j.nn.conf.serde.legacyformat.LegacyReconstructionDistributionDeserializer
  "Deserializer for ReconstructionDistribution JSON in legacy format - see BaseLegacyDeserializer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.serde.legacyformat LegacyReconstructionDistributionDeserializer]))

(defn ->legacy-reconstruction-distribution-deserializer
  "Constructor."
  (^LegacyReconstructionDistributionDeserializer []
    (new LegacyReconstructionDistributionDeserializer )))

(defn *register-legacy-class-default-name
  "clazz - `java.lang.Class`"
  ([^java.lang.Class clazz]
    (LegacyReconstructionDistributionDeserializer/registerLegacyClassDefaultName clazz)))

(defn *register-legacy-class-specified-name
  "name - `java.lang.String`
  clazz - `java.lang.Class`"
  ([^java.lang.String name ^java.lang.Class clazz]
    (LegacyReconstructionDistributionDeserializer/registerLegacyClassSpecifiedName name clazz)))

(defn get-legacy-names-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^LegacyReconstructionDistributionDeserializer this]
    (-> this (.getLegacyNamesMap))))

(defn get-legacy-json-mapper
  "returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper [^LegacyReconstructionDistributionDeserializer this]
    (-> this (.getLegacyJsonMapper))))

(defn get-deserialized-type
  "returns: `java.lang.Class<?>`"
  (^java.lang.Class [^LegacyReconstructionDistributionDeserializer this]
    (-> this (.getDeserializedType))))

