(ns org.deeplearning4j.nn.layers.feedforward.dense.DenseLayer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.feedforward.dense DenseLayer]))

(defn ->dense-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^DenseLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new DenseLayer conf input))
  (^DenseLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new DenseLayer conf)))

(defn fit
  "Description copied from interface: Model

  input - the data to fit the model to - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^DenseLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.fit input workspace-mgr))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^DenseLayer this]
    (-> this (.isPretrainLayer))))

(defn has-bias?
  "Description copied from class: BaseLayer

  returns: True if a bias term is present, false otherwise - `boolean`"
  (^Boolean [^DenseLayer this]
    (-> this (.hasBias))))

