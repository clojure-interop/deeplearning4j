(ns org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerSerializerStrategy
  "Strategy for serializing and unserializing a specific opType of normalizer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.serializer NormalizerSerializerStrategy]))

(defn write
  "Serialize a normalizer to a output stream

  normalizer - the normalizer - `T`
  stream - the output stream to write to - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^NormalizerSerializerStrategy this normalizer ^java.io.OutputStream stream]
    (-> this (.write normalizer stream))))

(defn restore
  "Restore a normalizer that was previously serialized by this strategy

  stream - the stream to read serialized data from - `java.io.InputStream`

  returns: the restored normalizer - `T`

  throws: java.io.IOException"
  ([^NormalizerSerializerStrategy this ^java.io.InputStream stream]
    (-> this (.restore stream))))

(defn get-supported-type
  "Get the enum opType of the supported normalizer

  returns: the enum opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^NormalizerSerializerStrategy this]
    (-> this (.getSupportedType))))

