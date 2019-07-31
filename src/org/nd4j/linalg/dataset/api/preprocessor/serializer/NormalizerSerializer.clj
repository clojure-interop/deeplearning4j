(ns org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerSerializer
  "Utility for serializing and unserializing Normalizer instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset.api.preprocessor.serializer NormalizerSerializer]))

(defn ->normalizer-serializer
  "Constructor."
  (^NormalizerSerializer []
    (new NormalizerSerializer )))

(defn *get-default
  "Get the default serializer configured with strategies for the built-in normalizer implementations

  returns: the default serializer - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerSerializer`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerSerializer []
    (NormalizerSerializer/getDefault )))

(defn write
  "Serialize a normalizer to the given file

  normalizer - the normalizer - `org.nd4j.linalg.dataset.api.preprocessor.Normalizer`
  file - the destination file - `java.io.File`

  throws: java.io.IOException"
  ([^NormalizerSerializer this ^org.nd4j.linalg.dataset.api.preprocessor.Normalizer normalizer ^java.io.File file]
    (-> this (.write normalizer file))))

(defn restore
  "Restore a normalizer from the given path

  path - path of the file containing a serialized normalizer - `java.lang.String`

  returns: the restored normalizer - `<T extends org.nd4j.linalg.dataset.api.preprocessor.Normalizer> T`

  throws: java.io.IOException"
  ([^NormalizerSerializer this ^java.lang.String path]
    (-> this (.restore path))))

(defn add-strategy
  "Add a normalizer serializer strategy

  strategy - the new strategy - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerSerializerStrategy`

  returns: self - `org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerSerializer`"
  (^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerSerializer [^NormalizerSerializer this ^org.nd4j.linalg.dataset.api.preprocessor.serializer.NormalizerSerializerStrategy strategy]
    (-> this (.addStrategy strategy))))

