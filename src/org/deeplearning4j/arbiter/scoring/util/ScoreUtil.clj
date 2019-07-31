(ns org.deeplearning4j.arbiter.scoring.util.ScoreUtil
  "Various utilities for functions used in arbiter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.scoring.util ScoreUtil]))

(defn ->score-util
  "Constructor."
  (^ScoreUtil []
    (new ScoreUtil )))

(defn *get-multi-iterator
  "Get a DataSetIterator
  from the given object whether it's a DataSetIterator
  or DataSetIteratorFactory, any other type will throw
  an IllegalArgumentException

  o - the object to get the iterator from - `java.lang.Object`

  returns: the datasetiterator from the given objects - `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`"
  (^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator [^java.lang.Object o]
    (ScoreUtil/getMultiIterator o)))

(defn *get-iterator
  "Get a DataSetIterator
  from the given object whether it's a DataSetIterator
  or DataSetIteratorFactory, any other type will throw
  an IllegalArgumentException

  o - the object to get the iterator from - `java.lang.Object`

  returns: the datasetiterator from the given objects - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  (^org.nd4j.linalg.dataset.api.iterator.DataSetIterator [^java.lang.Object o]
    (ScoreUtil/getIterator o)))

(defn *get-evaluation
  "Get the evaluation
  for the given model and test dataset

  model - the model to get the evaluation from - `org.deeplearning4j.nn.graph.ComputationGraph`
  test-data - the test data to do the evaluation on - `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`

  returns: the evaluation object with accumulated statistics
  for the current test data - `org.deeplearning4j.eval.Evaluation`"
  (^org.deeplearning4j.eval.Evaluation [^org.deeplearning4j.nn.graph.ComputationGraph model ^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator test-data]
    (ScoreUtil/getEvaluation model test-data)))

(defn *score
  "Score based on the loss function

  model - the model to score with - `org.deeplearning4j.nn.graph.ComputationGraph`
  test-data - the test data to score - `org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator`
  average - whether to average the scorefor the whole batch or not - `boolean`

  returns: the score for the given test set - `double`"
  (^Double [^org.deeplearning4j.nn.graph.ComputationGraph model ^org.nd4j.linalg.dataset.api.iterator.MultiDataSetIterator test-data ^Boolean average]
    (ScoreUtil/score model test-data average)))

(defn *get-score-from-regression-eval
  "Deprecated.

  eval - `org.deeplearning4j.eval.RegressionEvaluation`
  regression-value - `org.deeplearning4j.arbiter.scoring.RegressionValue`

  returns: `double`"
  (^Double [^org.deeplearning4j.eval.RegressionEvaluation eval ^org.deeplearning4j.arbiter.scoring.RegressionValue regression-value]
    (ScoreUtil/getScoreFromRegressionEval eval regression-value)))

