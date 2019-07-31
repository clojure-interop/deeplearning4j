(ns org.deeplearning4j.models.paragraphvectors.ParagraphVectors
  "Basic ParagraphVectors (aka Doc2Vec) implementation for DL4j, as wrapper over SequenceVectors"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.paragraphvectors ParagraphVectors]))

(defn infer-vector
  "This method calculates inferred vector for given text

  text - `java.lang.String`
  learning-rate - `double`
  min-learning-rate - `double`
  iterations - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ParagraphVectors this ^java.lang.String text ^Double learning-rate ^Double min-learning-rate ^Integer iterations]
    (-> this (.inferVector text learning-rate min-learning-rate iterations)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^ParagraphVectors this ^java.lang.String text]
    (-> this (.inferVector text))))

(defn nearest-labels
  "This method returns top N labels nearest to specified document

  document - `org.deeplearning4j.text.documentiterator.LabelledDocument`
  top-n - `int`

  returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^ParagraphVectors this ^org.deeplearning4j.text.documentiterator.LabelledDocument document ^Integer top-n]
    (-> this (.nearestLabels document top-n))))

(defn fit
  "Description copied from class: SequenceVectors"
  ([^ParagraphVectors this]
    (-> this (.fit))))

(defn predict
  "This method predicts label of the document.
  Computes a similarity wrt the mean of the
  representation of words in the document

  document - the document - `org.deeplearning4j.text.documentiterator.LabelledDocument`

  returns: the word distances for each label - `java.lang.String`"
  (^java.lang.String [^ParagraphVectors this ^org.deeplearning4j.text.documentiterator.LabelledDocument document]
    (-> this (.predict document))))

(defn extract-labels
  ""
  ([^ParagraphVectors this]
    (-> this (.extractLabels))))

(defn similarity-to-label
  "This method returns similarity of the document to specific label, based on mean value

  document - `org.deeplearning4j.text.documentiterator.LabelledDocument`
  label - `java.lang.String`

  returns: `double`"
  (^Double [^ParagraphVectors this ^org.deeplearning4j.text.documentiterator.LabelledDocument document ^java.lang.String label]
    (-> this (.similarityToLabel document label))))

(defn infer-vector-batched
  "This method implements batched inference, based on Java Future parallelism model.
  PLEASE NOTE: In order to use this method, LabelledDocument being passed in should have Id field defined.

  document - `org.deeplearning4j.text.documentiterator.LabelledDocument`

  returns: `java.util.concurrent.Future<org.nd4j.linalg.primitives.Pair<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>>`"
  (^java.util.concurrent.Future [^ParagraphVectors this ^org.deeplearning4j.text.documentiterator.LabelledDocument document]
    (-> this (.inferVectorBatched document))))

(defn predict-several
  "Predict several labels based on the document.
  Computes a similarity wrt the mean of the
  representation of words in the document

  document - raw text of the document - `org.deeplearning4j.text.documentiterator.LabelledDocument`
  limit - `int`

  returns: possible labels in descending order - `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^ParagraphVectors this ^org.deeplearning4j.text.documentiterator.LabelledDocument document ^Integer limit]
    (-> this (.predictSeveral document limit))))

(defn set-sequence-iterator
  "This method defines SequenceIterator instance, that will be used as training corpus source.
  Main difference with other iterators here: it allows you to pass already tokenized Sequence for training

  iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`"
  ([^ParagraphVectors this ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator]
    (-> this (.setSequenceIterator iterator))))

