(ns org.deeplearning4j.nn.api.Model
  "A Model is meant for predicting something from data.
 Note that this is not like supervised learning where
 there are labels attached to the examples."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.api Model]))

(defn score
  "The score for the model

  returns: the score for the model - `double`"
  (^Double [^Model this]
    (-> this (.score))))

(defn param-table
  "Table of parameters by key, for backprop
  For many models (dense layers, etc) - all parameters are backprop parameters

  backprop-params-only - If true, return backprop params only. If false: return all params (equivalent toparamsTable()) - `boolean`

  returns: `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^Model this ^Boolean backprop-params-only]
    (-> this (.paramTable backprop-params-only)))
  (^java.util.Map [^Model this]
    (-> this (.paramTable))))

(defn fit
  "Fit the model to the given data

  data - the data to fit the model to - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^Model this ^org.nd4j.linalg.api.ndarray.INDArray data ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.fit data workspace-mgr)))
  ([^Model this]
    (-> this (.fit))))

(defn set-param
  "Set the parameter with a new ndarray

  key - the key to se t - `java.lang.String`
  val - the new ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Model this ^java.lang.String key ^org.nd4j.linalg.api.ndarray.INDArray val]
    (-> this (.setParam key val))))

(defn gradient
  "Get the gradient. Note that this method will not calculate the gradient, it will rather return the gradient
  that has been computed before.
  For calculating the gradient, see computeGradientAndScore(LayerWorkspaceMgr) } .

  returns: the gradient for this model, as calculated before - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^Model this]
    (-> this (.gradient))))

(defn set-conf
  "Setter for the configuration

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  ([^Model this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.setConf conf))))

(defn params
  "Parameters of the model (if any)

  returns: the parameters of the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Model this]
    (-> this (.params))))

(defn compute-gradient-and-score
  "Update the score

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^Model this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeGradientAndScore workspace-mgr))))

(defn add-listeners
  "This method ADDS additional TrainingListener to existing listeners

  listener - `org.deeplearning4j.optimize.api.TrainingListener`"
  ([^Model this ^org.deeplearning4j.optimize.api.TrainingListener listener]
    (-> this (.addListeners listener))))

(defn get-param
  "Get the parameter

  param - the key of the parameter - `java.lang.String`

  returns: the parameter vector/matrix with that particular key - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Model this ^java.lang.String param]
    (-> this (.getParam param))))

(defn get-gradients-view-array
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Model this]
    (-> this (.getGradientsViewArray))))

(defn batch-size
  "The current inputs batch size

  returns: the current inputs batch size - `int`"
  (^Integer [^Model this]
    (-> this (.batchSize))))

(defn set-params-view-array
  "Set the initial parameters array as a view of the full (backprop) network parameters
  NOTE: this is intended to be used internally in MultiLayerNetwork and ComputationGraph, not by users.

  params - a 1 x nParams row vector that is a view of the larger (MLN/CG) parameters array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Model this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParamsViewArray params))))

(defn update
  "Perform one update applying the gradient

  gradient - the gradient to apply - `org.nd4j.linalg.api.ndarray.INDArray`
  param-type - `java.lang.String`"
  ([^Model this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^java.lang.String param-type]
    (-> this (.update gradient param-type)))
  ([^Model this ^org.deeplearning4j.nn.gradient.Gradient gradient]
    (-> this (.update gradient))))

(defn set-param-table
  "Setter for the param table

  param-table - `java.util.Map`"
  ([^Model this ^java.util.Map param-table]
    (-> this (.setParamTable param-table))))

(defn set-params
  "Set the parameters for this model.
  This expects a linear ndarray which then be unpacked internally
  relative to the expected ordering of the model

  params - the parameters for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Model this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParams params))))

(defn set-listeners
  "Set the trainingListeners for the ComputationGraph (and all layers in the network)

  listeners - `java.util.Collection`"
  ([^Model this ^java.util.Collection listeners]
    (-> this (.setListeners listeners))))

(defn conf
  "The configuration for the neural network

  returns: the configuration for the neural network - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^Model this]
    (-> this (.conf))))

(defn set-backprop-gradients-view-array
  "Set the gradients array as a view of the full (backprop) network parameters
  NOTE: this is intended to be used internally in MultiLayerNetwork and ComputationGraph, not by users.

  gradients - a 1 x nParams row vector that is a view of the larger (MLN/CG) gradients array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Model this ^org.nd4j.linalg.api.ndarray.INDArray gradients]
    (-> this (.setBackpropGradientsViewArray gradients))))

(defn num-params
  "the number of parameters for the model

  backwards - `boolean`

  returns: the number of parameters for the model - `int`"
  (^Integer [^Model this ^Boolean backwards]
    (-> this (.numParams backwards)))
  (^Integer [^Model this]
    (-> this (.numParams))))

(defn input
  "The input/feature matrix for the model

  returns: the input/feature matrix for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Model this]
    (-> this (.input))))

(defn init
  "Init the model"
  ([^Model this]
    (-> this (.init))))

(defn clear
  "Clear input"
  ([^Model this]
    (-> this (.clear))))

(defn get-optimizer
  "Returns this models optimizer

  returns: this models optimizer - `org.deeplearning4j.optimize.api.ConvexOptimizer`"
  (^org.deeplearning4j.optimize.api.ConvexOptimizer [^Model this]
    (-> this (.getOptimizer))))

(defn apply-constraints
  "Apply any constraints to the model

  iteration - `int`
  epoch - `int`"
  ([^Model this ^Integer iteration ^Integer epoch]
    (-> this (.applyConstraints iteration epoch))))

(defn gradient-and-score
  "Get the gradient and score

  returns: the gradient and score - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,java.lang.Double>`"
  (^org.nd4j.linalg.primitives.Pair [^Model this]
    (-> this (.gradientAndScore))))

