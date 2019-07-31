(ns org.nd4j.linalg.dataset.api.preprocessor.serializer.MultiMinMaxSerializerStrategy
  "Strategy for saving and restoring MultiNormalizerMinMaxScaler instances in single binary files"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.serializer MultiMinMaxSerializerStrategy]))

(defn ->multi-min-max-serializer-strategy
  "Constructor."
  (^MultiMinMaxSerializerStrategy []
    (new MultiMinMaxSerializerStrategy )))

(defn write
  "Serialize a MultiNormalizerMinMaxScaler to a output stream

  normalizer - the normalizer - `org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerMinMaxScaler`
  stream - the output stream to write to - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^MultiMinMaxSerializerStrategy this ^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerMinMaxScaler normalizer ^java.io.OutputStream stream]
    (-> this (.write normalizer stream))))

(defn restore
  "Restore a MultiNormalizerMinMaxScaler that was previously serialized by this strategy

  stream - the input stream to restore from - `java.io.InputStream`

  returns: the restored MultiNormalizerMinMaxScaler - `org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerMinMaxScaler`

  throws: java.io.IOException"
  (^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerMinMaxScaler [^MultiMinMaxSerializerStrategy this ^java.io.InputStream stream]
    (-> this (.restore stream))))

(defn get-supported-type
  "Description copied from interface: NormalizerSerializerStrategy

  returns: the enum opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^MultiMinMaxSerializerStrategy this]
    (-> this (.getSupportedType))))

