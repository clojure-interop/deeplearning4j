(ns org.nd4j.linalg.dataset.api.preprocessor.serializer.CustomSerializerStrategy
  "Base class for custom normalizer serializers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.serializer CustomSerializerStrategy]))

(defn ->custom-serializer-strategy
  "Constructor."
  (^CustomSerializerStrategy []
    (new CustomSerializerStrategy )))

(defn get-supported-type
  "Description copied from interface: NormalizerSerializerStrategy

  returns: the enum opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^CustomSerializerStrategy this]
    (-> this (.getSupportedType))))

(defn get-supported-class
  "Get the class of the supported custom serializer

  returns: the class - `java.lang.Class<T>`"
  (^java.lang.Class [^CustomSerializerStrategy this]
    (-> this (.getSupportedClass))))

