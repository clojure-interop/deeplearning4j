(ns org.nd4j.linalg.dataset.api.preprocessor.serializer.StandardizeSerializerStrategy
  "Strategy for saving and restoring NormalizerStandardize instances in single binary files"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.serializer StandardizeSerializerStrategy]))

(defn ->standardize-serializer-strategy
  "Constructor."
  (^StandardizeSerializerStrategy []
    (new StandardizeSerializerStrategy )))

(defn write
  "Description copied from interface: NormalizerSerializerStrategy

  normalizer - the normalizer - `org.nd4j.linalg.dataset.api.preprocessor.NormalizerStandardize`
  stream - the output stream to write to - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^StandardizeSerializerStrategy this ^org.nd4j.linalg.dataset.api.preprocessor.NormalizerStandardize normalizer ^java.io.OutputStream stream]
    (-> this (.write normalizer stream))))

(defn restore
  "Description copied from interface: NormalizerSerializerStrategy

  stream - the stream to read serialized data from - `java.io.InputStream`

  returns: the restored normalizer - `org.nd4j.linalg.dataset.api.preprocessor.NormalizerStandardize`

  throws: java.io.IOException"
  (^org.nd4j.linalg.dataset.api.preprocessor.NormalizerStandardize [^StandardizeSerializerStrategy this ^java.io.InputStream stream]
    (-> this (.restore stream))))

(defn get-supported-type
  "Description copied from interface: NormalizerSerializerStrategy

  returns: the enum opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^StandardizeSerializerStrategy this]
    (-> this (.getSupportedType))))

