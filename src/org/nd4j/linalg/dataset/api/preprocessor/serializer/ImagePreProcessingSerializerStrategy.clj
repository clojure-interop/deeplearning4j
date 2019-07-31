(ns org.nd4j.linalg.dataset.api.preprocessor.serializer.ImagePreProcessingSerializerStrategy
  "NormalizerSerializerStrategy
 for ImagePreProcessingScaler
 Saves the min range, max range, and max pixel value as
 doubles"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.serializer ImagePreProcessingSerializerStrategy]))

(defn ->image-pre-processing-serializer-strategy
  "Constructor."
  (^ImagePreProcessingSerializerStrategy []
    (new ImagePreProcessingSerializerStrategy )))

(defn write
  "Description copied from interface: NormalizerSerializerStrategy

  normalizer - the normalizer - `org.nd4j.linalg.dataset.api.preprocessor.ImagePreProcessingScaler`
  stream - the output stream to write to - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^ImagePreProcessingSerializerStrategy this ^org.nd4j.linalg.dataset.api.preprocessor.ImagePreProcessingScaler normalizer ^java.io.OutputStream stream]
    (-> this (.write normalizer stream))))

(defn restore
  "Description copied from interface: NormalizerSerializerStrategy

  stream - the stream to read serialized data from - `java.io.InputStream`

  returns: the restored normalizer - `org.nd4j.linalg.dataset.api.preprocessor.ImagePreProcessingScaler`

  throws: java.io.IOException"
  (^org.nd4j.linalg.dataset.api.preprocessor.ImagePreProcessingScaler [^ImagePreProcessingSerializerStrategy this ^java.io.InputStream stream]
    (-> this (.restore stream))))

(defn get-supported-type
  "Description copied from interface: NormalizerSerializerStrategy

  returns: the enum opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^ImagePreProcessingSerializerStrategy this]
    (-> this (.getSupportedType))))

