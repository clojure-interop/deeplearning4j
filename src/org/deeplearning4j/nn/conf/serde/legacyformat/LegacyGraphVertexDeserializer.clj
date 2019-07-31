(ns org.deeplearning4j.nn.conf.serde.legacyformat.LegacyGraphVertexDeserializer
  "Deserializer for GraphVertex JSON in legacy format - see BaseLegacyDeserializer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.serde.legacyformat LegacyGraphVertexDeserializer]))

(defn ->legacy-graph-vertex-deserializer
  "Constructor."
  (^LegacyGraphVertexDeserializer []
    (new LegacyGraphVertexDeserializer )))

(defn *register-legacy-class-default-name
  "clazz - `java.lang.Class`"
  ([^java.lang.Class clazz]
    (LegacyGraphVertexDeserializer/registerLegacyClassDefaultName clazz)))

(defn *register-legacy-class-specified-name
  "name - `java.lang.String`
  clazz - `java.lang.Class`"
  ([^java.lang.String name ^java.lang.Class clazz]
    (LegacyGraphVertexDeserializer/registerLegacyClassSpecifiedName name clazz)))

(defn get-legacy-names-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^LegacyGraphVertexDeserializer this]
    (-> this (.getLegacyNamesMap))))

(defn get-legacy-json-mapper
  "returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper [^LegacyGraphVertexDeserializer this]
    (-> this (.getLegacyJsonMapper))))

(defn get-deserialized-type
  "returns: `java.lang.Class<?>`"
  (^java.lang.Class [^LegacyGraphVertexDeserializer this]
    (-> this (.getDeserializedType))))

