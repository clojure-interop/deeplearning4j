(ns org.deeplearning4j.models.word2vec.iterator.Word2VecDataFetcher
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec.iterator Word2VecDataFetcher]))

(defn ->word-2-vec-data-fetcher
  "Constructor.

  path - `java.lang.String`
  vec - `org.deeplearning4j.models.word2vec.Word2Vec`
  labels - `java.util.List`"
  (^Word2VecDataFetcher [^java.lang.String path ^org.deeplearning4j.models.word2vec.Word2Vec vec ^java.util.List labels]
    (new Word2VecDataFetcher path vec labels)))

(defn *get-begin
  "returns: `java.util.regex.Pattern`"
  (^java.util.regex.Pattern []
    (Word2VecDataFetcher/getBegin )))

(defn *get-end
  "returns: `java.util.regex.Pattern`"
  (^java.util.regex.Pattern []
    (Word2VecDataFetcher/getEnd )))

(defn fetch
  "Description copied from interface: DataSetFetcher

  num-examples - the number of examples to fetch - `int`"
  ([^Word2VecDataFetcher this ^Integer num-examples]
    (-> this (.fetch num-examples))))

(defn input-columns
  "Description copied from interface: DataSetFetcher

  returns: the length of a feature vector for an individual example - `int`"
  (^Integer [^Word2VecDataFetcher this]
    (-> this (.inputColumns))))

(defn get-files
  "returns: `java.util.Iterator<java.io.File>`"
  (^java.util.Iterator [^Word2VecDataFetcher this]
    (-> this (.getFiles))))

(defn next
  "Description copied from interface: DataSetFetcher

  returns: the next dataset - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^Word2VecDataFetcher this]
    (-> this (.next))))

(defn has-more?
  "Description copied from interface: DataSetFetcher

  returns: whether the data applyTransformToDestination has more to load - `boolean`"
  (^Boolean [^Word2VecDataFetcher this]
    (-> this (.hasMore))))

(defn total-examples
  "Description copied from interface: DataSetFetcher

  returns: the total number of examples - `int`"
  (^Integer [^Word2VecDataFetcher this]
    (-> this (.totalExamples))))

(defn total-outcomes
  "Description copied from interface: DataSetFetcher

  returns: the number of labels for a dataset - `int`"
  (^Integer [^Word2VecDataFetcher this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetFetcher"
  ([^Word2VecDataFetcher this]
    (-> this (.reset))))

(defn cursor
  "Description copied from interface: DataSetFetcher

  returns: a cursor similar to an index - `int`"
  (^Integer [^Word2VecDataFetcher this]
    (-> this (.cursor))))

(defn get-labels
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Word2VecDataFetcher this]
    (-> this (.getLabels))))

(defn get-vec
  "returns: `org.deeplearning4j.models.word2vec.Word2Vec`"
  (^org.deeplearning4j.models.word2vec.Word2Vec [^Word2VecDataFetcher this]
    (-> this (.getVec))))

(defn get-batch
  "returns: `int`"
  (^Integer [^Word2VecDataFetcher this]
    (-> this (.getBatch))))

(defn get-cache
  "returns: `java.util.List<org.deeplearning4j.text.movingwindow.Window>`"
  (^java.util.List [^Word2VecDataFetcher this]
    (-> this (.getCache))))

