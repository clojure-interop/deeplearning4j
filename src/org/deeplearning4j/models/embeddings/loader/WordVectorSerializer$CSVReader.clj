(ns org.deeplearning4j.models.embeddings.loader.WordVectorSerializer$CSVReader
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.loader WordVectorSerializer$CSVReader]))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^WordVectorSerializer$CSVReader this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.models.word2vec.VocabWord,float[]>`"
  ([^WordVectorSerializer$CSVReader this]
    (-> this (.next))))

(defn close
  "throws: java.lang.Exception"
  ([^WordVectorSerializer$CSVReader this]
    (-> this (.close))))

