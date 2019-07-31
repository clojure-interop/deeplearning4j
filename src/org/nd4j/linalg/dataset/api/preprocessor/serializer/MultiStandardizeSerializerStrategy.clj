(ns org.nd4j.linalg.dataset.api.preprocessor.serializer.MultiStandardizeSerializerStrategy
  "Strategy for saving and restoring MultiNormalizerStandardize instances in single binary files"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.serializer MultiStandardizeSerializerStrategy]))

(defn ->multi-standardize-serializer-strategy
  "Constructor."
  (^MultiStandardizeSerializerStrategy []
    (new MultiStandardizeSerializerStrategy )))

(defn write
  "Serialize a MultiNormalizerStandardize to a output stream

  normalizer - the normalizer - `org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerStandardize`
  stream - the output stream to write to - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^MultiStandardizeSerializerStrategy this ^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerStandardize normalizer ^java.io.OutputStream stream]
    (-> this (.write normalizer stream))))

(defn restore
  "Restore a MultiNormalizerStandardize that was previously serialized by this strategy

  stream - the input stream to restore from - `java.io.InputStream`

  returns: the restored MultiNormalizerStandardize - `org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerStandardize`

  throws: java.io.IOException"
  (^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerStandardize [^MultiStandardizeSerializerStrategy this ^java.io.InputStream stream]
    (-> this (.restore stream))))

(defn get-supported-type
  "Description copied from interface: NormalizerSerializerStrategy

  returns: the enum opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^MultiStandardizeSerializerStrategy this]
    (-> this (.getSupportedType))))

