(ns org.deeplearning4j.nn.api.NeuralNetwork
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.api NeuralNetwork]))

(defn init
  "This method does initialization of model
  PLEASE NOTE: All implementations should track own state, to avoid double spending"
  ([^NeuralNetwork this]
    (-> this (.init))))

(defn params
  "This method returns model parameters as single INDArray

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NeuralNetwork this]
    (-> this (.params))))

(defn updater-state
  "This method returns updater state (if applicable), null otherwise

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NeuralNetwork this]
    (-> this (.updaterState))))

(defn get-optimizer
  "This method returns Optimizer used for training

  returns: `org.deeplearning4j.optimize.api.ConvexOptimizer`"
  (^org.deeplearning4j.optimize.api.ConvexOptimizer [^NeuralNetwork this]
    (-> this (.getOptimizer))))

(defn fit
  "This method fits model with a given DataSet

  data-set - `org.nd4j.linalg.dataset.api.DataSet`"
  ([^NeuralNetwork this ^org.nd4j.linalg.dataset.api.DataSet data-set]
    (-> this (.fit data-set))))

(defn do-evaluation
  "This method executes evaluation of the model against given iterator and evaluation implementations

  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  evaluations - `T`

  returns: `<T extends org.deeplearning4j.eval.IEvaluation> T[]`"
  ([^NeuralNetwork this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator evaluations]
    (-> this (.doEvaluation iterator evaluations))))

