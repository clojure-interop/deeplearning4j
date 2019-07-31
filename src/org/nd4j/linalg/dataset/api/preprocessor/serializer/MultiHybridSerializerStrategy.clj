(ns org.nd4j.linalg.dataset.api.preprocessor.serializer.MultiHybridSerializerStrategy
  "Strategy for saving and restoring MultiNormalizerHybrid instances in single binary files"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.serializer MultiHybridSerializerStrategy]))

(defn ->multi-hybrid-serializer-strategy
  "Constructor."
  (^MultiHybridSerializerStrategy []
    (new MultiHybridSerializerStrategy )))

(defn write
  "Serialize a MultiNormalizerHybrid to a output stream

  normalizer - the normalizer - `org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid`
  stream - the output stream to write to - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^MultiHybridSerializerStrategy this ^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid normalizer ^java.io.OutputStream stream]
    (-> this (.write normalizer stream))))

(defn restore
  "Restore a MultiNormalizerHybrid that was previously serialized by this strategy

  stream - the input stream to restore from - `java.io.InputStream`

  returns: the restored MultiNormalizerStandardize - `org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid`

  throws: java.io.IOException"
  (^org.nd4j.linalg.dataset.api.preprocessor.MultiNormalizerHybrid [^MultiHybridSerializerStrategy this ^java.io.InputStream stream]
    (-> this (.restore stream))))

(defn get-supported-type
  "Description copied from interface: NormalizerSerializerStrategy

  returns: the enum opType - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerType [^MultiHybridSerializerStrategy this]
    (-> this (.getSupportedType))))

