(ns org.deeplearning4j.iterator.CnnSentenceDataSetIterator
  "A DataSetIterator that provides data for training a CNN sentence classification models (though can of course
 be used for general documents, not just sentences. The iterator handles conversion of sentences to training data for
 CNNs, where each word is encoded using the word vector from the specified WordVectors (i.e., word2vec etc) model.
 Labels are encoded using a one-hot representation and are 2d - i.e., are intended to be used with a model that
 utilizes global pooling.

 Specifically:
 - Features have shape [minibatchSize, 1, maxSentenceLength, wordVectorSize] OR [minibatchSize, 1, wordVectorSize, maxSentenceLength]
 depending on the configuration (for sentencesAlongHeight = true/false respectively)
 - Labels are a 2d array with shape [minibatchSize, numLabels].
 Sentences and labels are provided by a LabeledSentenceProvider - different implementations of this provide different
 ways of loading sentences/documents with labels - for example, from files, etc.

 Note: With regard to labels to class index assignment, they are sorted alphabetically. To get the assigment/mapping,
 use getLabels() or getLabelClassMap()"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.iterator CnnSentenceDataSetIterator]))

(defn input-columns
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^CnnSentenceDataSetIterator this]
    (-> this (.inputColumns))))

(defn next
  "Description copied from interface: DataSetIterator

  num - the number of examples - `int`

  returns: the next data applyTransformToDestination - `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^CnnSentenceDataSetIterator this ^Integer num]
    (-> this (.next num)))
  (^org.nd4j.linalg.dataset.DataSet [^CnnSentenceDataSetIterator this]
    (-> this (.next))))

(defn get-label-class-map
  "returns: `java.util.Map<java.lang.String,java.lang.Integer>`"
  (^java.util.Map [^CnnSentenceDataSetIterator this]
    (-> this (.getLabelClassMap))))

(defn get-pre-processor
  "Description copied from interface: DataSetIterator

  returns: `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  (^org.nd4j.linalg.dataset.api.DataSetPreProcessor [^CnnSentenceDataSetIterator this]
    (-> this (.getPreProcessor))))

(defn total-outcomes
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^CnnSentenceDataSetIterator this]
    (-> this (.totalOutcomes))))

(defn reset
  "Description copied from interface: DataSetIterator"
  ([^CnnSentenceDataSetIterator this]
    (-> this (.reset))))

(defn batch
  "Description copied from interface: DataSetIterator

  returns: `int`"
  (^Integer [^CnnSentenceDataSetIterator this]
    (-> this (.batch))))

(defn load-single-sentence
  "Generally used post training time to load a single sentence for predictions

  sentence - `java.lang.String`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CnnSentenceDataSetIterator this ^java.lang.String sentence]
    (-> this (.loadSingleSentence sentence))))

(defn async-supported
  "Description copied from interface: DataSetIterator

  returns: true if asynchronous prefetching from this iterator is OK; false if asynchronous prefetching should not
  be used with this iterator - `boolean`"
  (^Boolean [^CnnSentenceDataSetIterator this]
    (-> this (.asyncSupported))))

(defn remove
  ""
  ([^CnnSentenceDataSetIterator this]
    (-> this (.remove))))

(defn get-labels
  "Description copied from interface: DataSetIterator

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^CnnSentenceDataSetIterator this]
    (-> this (.getLabels))))

(defn set-pre-processor
  "Description copied from interface: DataSetIterator

  pre-processor - a pre processor to set - `org.nd4j.linalg.dataset.api.DataSetPreProcessor`"
  ([^CnnSentenceDataSetIterator this ^org.nd4j.linalg.dataset.api.DataSetPreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^CnnSentenceDataSetIterator this]
    (-> this (.hasNext))))

(defn reset-supported
  "Description copied from interface: DataSetIterator

  returns: true if reset method is supported; false otherwise - `boolean`"
  (^Boolean [^CnnSentenceDataSetIterator this]
    (-> this (.resetSupported))))

