(ns org.deeplearning4j.models.embeddings.loader.VectorsConfiguration
  "This is simple bean/POJO for Word2Vec persistence handling.
 It holds whole w2v model configuration info, except of TokenizerFactory and SentenceIterator, since they are not intended for serialization, and specified at run-time."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.loader VectorsConfiguration]))

(defn ->vectors-configuration
  "Constructor."
  (^VectorsConfiguration []
    (new VectorsConfiguration )))

(defn *from-json
  "json - `java.lang.String`

  returns: `org.deeplearning4j.models.embeddings.loader.VectorsConfiguration`"
  (^org.deeplearning4j.models.embeddings.loader.VectorsConfiguration [^java.lang.String json]
    (VectorsConfiguration/fromJson json)))

(defn to-json
  "returns: `java.lang.String`"
  (^java.lang.String [^VectorsConfiguration this]
    (-> this (.toJson))))

(defn to-encoded-json
  "returns: `java.lang.String`"
  (^java.lang.String [^VectorsConfiguration this]
    (-> this (.toEncodedJson))))

