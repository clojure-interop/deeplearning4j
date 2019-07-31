(ns org.nd4j.linalg.dataset.api.preprocessor.serializer.MinMaxSerializerStrategy
  "Strategy for saving and restoring NormalizerMinMaxScaler instances in single binary files"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.serializer MinMaxSerializerStrategy]))

(defn ->min-max-serializer-strategy
  "Constructor."
  (^MinMaxSerializerStrategy []
    (new MinMaxSerializerStrategy )))

(defn write
  "Description copied from interface: NormalizerSerializerStrategy

  normalizer - the normalizer - `org.nd4j.linalg.dataset.api.preprocessor.NormalizerMinMaxScaler`
  stream - the output stream to write to - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^MinMaxSerializerStrategy this ^org.nd4j.linalg.dataset.api.preprocessor.NormalizerMinMaxScaler normalizer ^java.io.OutputStream stream]
    (-> this (.write normalizer stream))))

(defn restore
  "Description copied from interface: NormalizerSerializerStrategy

  stream - the stream to read serialized data from - `java.io.InputStream`

  returns: the restored normalizer - `org.nd4j.linalg.dataset.api.preprocessor.NormalizerMinMaxScaler`

  throws: java.io.IOException"
  (^org.nd4j.linalg.dataset.api.preprocessor.NormalizerMinMaxScaler [^MinMaxSerializerStrategy this ^java.io.InputStream stream]
    (-> this (.restore stream))))

(defn get-supported-type
  "Description copied from interface: NormalizerSerializerStrategy

  returns: the enum opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^MinMaxSerializerStrategy this]
    (-> this (.getSupportedType))))

