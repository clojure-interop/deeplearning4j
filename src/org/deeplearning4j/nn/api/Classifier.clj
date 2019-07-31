(ns org.deeplearning4j.nn.api.Classifier
  "A classifier (this is for supervised learning)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.api Classifier]))

(defn f-1-score
  "Returns the f1 score for the given examples.
  Think of this to be like a percentage right.
  The higher the number the more it got right.
  This is on a scale from 0 to 1.

  examples - te the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - the true labels - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the scores for each ndarray - `double`"
  (^Double [^Classifier this ^org.nd4j.linalg.api.ndarray.INDArray examples ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.f1Score examples labels)))
  (^Double [^Classifier this ^org.nd4j.linalg.dataset.api.DataSet data]
    (-> this (.f1Score data))))

(defn num-labels
  "Returns the number of possible labels

  returns: the number of possible labels for this classifier - `int`"
  (^Integer [^Classifier this]
    (-> this (.numLabels))))

(defn fit
  "Fit the model

  examples - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - the example labels(a binary outcome matrix) - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Classifier this ^org.nd4j.linalg.api.ndarray.INDArray examples ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.fit examples labels)))
  ([^Classifier this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iter]
    (-> this (.fit iter))))

(defn predict
  "Takes in a list of examples
  For each row, returns a label

  examples - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the labels for each example - `int[]`"
  ([^Classifier this ^org.nd4j.linalg.api.ndarray.INDArray examples]
    (-> this (.predict examples))))

(defn label-probabilities
  "Returns the probabilities for each label
  for each example row wise

  examples - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the likelihoods of each example and each label - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Classifier this ^org.nd4j.linalg.api.ndarray.INDArray examples]
    (-> this (.labelProbabilities examples))))

