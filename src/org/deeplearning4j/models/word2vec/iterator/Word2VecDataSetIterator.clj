(ns org.deeplearning4j.models.word2vec.iterator.Word2VecDataSetIterator
  "Iterates over a sentence with moving window to produce a data applyTransformToDestination
 for word windows based on a pretrained word2vec."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec.iterator Word2VecDataSetIterator]))

(defn ->word-2-vec-data-set-iterator
  "Constructor.

  Allows for customization of all of the params of the iterator

  vec - the word2vec model to use - `org.deeplearning4j.models.word2vec.Word2Vec`
  iter - the sentence iterator to use - `org.deeplearning4j.text.sentenceiterator.labelaware.LabelAwareSentenceIterator`
  labels - the possible labels - `java.util.List`
  batch - the batch size - `int`
  homogenization - whether to homogenize the sentences or not - `boolean`
  add-labels - whether to add labels for windows - `boolean`"
  (^Word2VecDataSetIterator [^org.deeplearning4j.models.word2vec.Word2Vec vec ^org.deeplearning4j.text.sentenceiterator.labelaware.LabelAwareSentenceIterator iter ^java.util.List labels ^Integer batch ^Boolean homogenization ^Boolean add-labels]
    (new Word2VecDataSetIterator vec iter labels batch homogenization add-labels))
  (^Word2VecDataSetIterator [^org.deeplearning4j.models.word2vec.Word2Vec vec ^org.deeplearning4j.text.sentenceiterator.labelaware.LabelAwareSentenceIterator iter ^java.util.List labels ^Integer batch]
    (new Word2VecDataSetIterator vec iter labels batch))
  (^Word2VecDataSetIterator [^org.deeplearning4j.models.word2vec.Word2Vec vec ^org.deeplearning4j.text.sentenceiterator.labelaware.LabelAwareSentenceIterator iter ^java.util.List labels]
    (new Word2VecDataSetIterator vec iter labels)))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^Word2VecDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Like the standard next method but allows a
  customizable number of examples returned

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^Word2VecDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^Word2VecDataSetIterator this]
    (-> this (.next))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^Word2VecDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^Word2VecDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^Word2VecDataSetIterator this]
    (-> this (.batch))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^Word2VecDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  "Removes from the underlying collection the last element returned
  by this iterator (optional operation). This method can be called
  only once per call to next(int). The behavior of an iterator
  is unspecified if the underlying collection is modified while the
  iteration is in progress in any way other than by calling this
  method.

  throws: java.lang.UnsupportedOperationException - if the removeoperation is not supported by this iterator"
  ([^Word2VecDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Word2VecDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^Word2VecDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "Returns true if the iteration has more elements.
  (In other words, returns true if next(int) would
  return an element rather than throwing an exception.)

  returns: true if the iteration has more elements - `boolean`"
  (^Boolean [^Word2VecDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^Word2VecDataSetIterator this]
    (-> this (.resetSupported))))

