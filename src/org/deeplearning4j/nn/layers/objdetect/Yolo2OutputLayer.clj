(ns org.deeplearning4j.nn.layers.objdetect.Yolo2OutputLayer
  "Output (loss) layer for YOLOv2 object detection model, based on the papers:
 YOLO9000: Better, Faster, Stronger - Redmon & Farhadi (2016) - https://arxiv.org/abs/1612.08242
 and
 You Only Look Once: Unified, Real-Time Object Detection - Redmon et al. (2016) -
 http://www.cv-foundation.org/openaccess/content_cvpr_2016/papers/Redmon_You_Only_Look_CVPR_2016_paper.pdf

 This loss function implementation is based on the YOLOv2 version of the paper. However, note that it doesn't
 currently support simultaneous training on both detection and classification datasets as described in the
 YOlO9000 paper.

 Label format: [minibatch, 4+C, H, W]
 Order for labels depth: [x1,y1,x2,y2,(class labels)]
 x1 = box top left position
 y1 = as above, y axis
 x2 = box bottom right position
 y2 = as above y axis
 Note: labels are represented as a multiple of grid size - for a 13x13 grid, (0,0) is top left, (13,13) is bottom right

 Input format: [minibatch, B*(5+C), H, W] -> Reshape to [minibatch, B, 5+C, H, W]
 B = number of bounding boxes (determined by config)
 C = number of classes
 H = output/label height
 W = output/label width

 Note that mask arrays are not required - this implementation infers the presence or absence of objects in each grid
 cell from the class labels (which should be 1-hot if an object is present, or all 0s otherwise)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.objdetect Yolo2OutputLayer]))

(defn ->yolo-2-output-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^Yolo2OutputLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new Yolo2OutputLayer conf)))

(defn get-predicted-objects
  "network-output - `org.nd4j.linalg.api.ndarray.INDArray`
  threshold - `double`

  returns: `java.util.List<org.deeplearning4j.nn.layers.objdetect.DetectedObject>`"
  (^java.util.List [^Yolo2OutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray network-output ^Double threshold]
    (-> this (.getPredictedObjects network-output threshold))))

(defn score
  "Description copied from interface: Model

  returns: the score for the model - `double`"
  (^Double [^Yolo2OutputLayer this]
    (-> this (.score))))

(defn fit
  "Description copied from interface: Classifier

  examples - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - the example labels(a binary outcome matrix) - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Yolo2OutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.fit examples labels)))
  ([^Yolo2OutputLayer this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iter]
    (-> this (.fit iter))))

(defn predict
  "Description copied from interface: Classifier

  examples - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the labels for each example - `int[]`"
  ([^Yolo2OutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples]
    (-> this (.predict examples))))

(defn compute-gradient-and-score
  "Description copied from interface: Model

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^Yolo2OutputLayer this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeGradientAndScore workspace-mgr))))

(defn activate
  "Description copied from interface: Layer

  training - training or test mode - `boolean`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the activation (layer output) of the last specified input. Note that the returned array should be placed
  in the ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Yolo2OutputLayer this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn compute-score
  "Description copied from interface: IOutputLayer

  full-network-l-1 - L1 regularization term for the entire network - `double`
  full-network-l-2 - L2 regularization term for the entire network - `double`
  training - whether score should be calculated at train or test time (this affects things like application ofdropout, etc) - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: score (loss function) - `double`"
  (^Double [^Yolo2OutputLayer this ^Double full-network-l-1 ^Double full-network-l-2 ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeScore full-network-l-1 full-network-l-2 training workspace-mgr))))

(defn get-probability-matrix
  "Get the probability matrix (probability of the specified class, assuming an object is present, for all x/y
  positions), from the network output activations array

  network-output - Network output activations - `org.nd4j.linalg.api.ndarray.INDArray`
  example - Example number, in minibatch - `int`
  class-number - Class number - `int`

  returns: Confidence matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Yolo2OutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray network-output ^Integer example ^Integer class-number]
    (-> this (.getProbabilityMatrix network-output example class-number))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^Yolo2OutputLayer this]
    (-> this (.isPretrainLayer))))

(defn clear-noise-weight-params
  ""
  ([^Yolo2OutputLayer this]
    (-> this (.clearNoiseWeightParams))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^Yolo2OutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn f-1-score
  "Description copied from interface: Classifier

  examples - te the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - the true labels - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the scores for each ndarray - `double`"
  (^Double [^Yolo2OutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.f1Score examples labels)))
  (^Double [^Yolo2OutputLayer this ^org.nd4j.linalg.dataset.api.DataSet data]
    (-> this (.f1Score data))))

(defn compute-score-for-examples
  "Description copied from interface: IOutputLayer

  full-network-l-1 - L1 regularization term for the entire network (or, 0.0 to not include regularization) - `double`
  full-network-l-2 - L2 regularization term for the entire network (or, 0.0 to not include regularization) - `double`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: A column INDArray of shape [numExamples,1], where entry i is the score of the ith example - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Yolo2OutputLayer this ^Double full-network-l-1 ^Double full-network-l-2 ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeScoreForExamples full-network-l-1 full-network-l-2 workspace-mgr))))

(defn label-probabilities
  "Description copied from interface: Classifier

  examples - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the likelihoods of each example and each label - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Yolo2OutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples]
    (-> this (.labelProbabilities examples))))

(defn get-confidence-matrix
  "Get the confidence matrix (confidence for all x/y positions) for the specified bounding box, from the network
  output activations array

  network-output - Network output activations - `org.nd4j.linalg.api.ndarray.INDArray`
  example - Example number, in minibatch - `int`
  bb-number - Bounding box number - `int`

  returns: Confidence matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Yolo2OutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray network-output ^Integer example ^Integer bb-number]
    (-> this (.getConfidenceMatrix network-output example bb-number))))

(defn clone
  "returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^Yolo2OutputLayer this]
    (-> this (.clone))))

(defn num-labels
  "Description copied from interface: Classifier

  returns: the number of possible labels for this classifier - `int`"
  (^Integer [^Yolo2OutputLayer this]
    (-> this (.numLabels))))

(defn needs-labels
  "Description copied from interface: IOutputLayer

  returns: true if this output layer needs labels or not - `boolean`"
  (^Boolean [^Yolo2OutputLayer this]
    (-> this (.needsLabels))))

(defn gradient-and-score
  "Description copied from interface: Model

  returns: the gradient and score - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,java.lang.Double>`"
  (^org.nd4j.linalg.primitives.Pair [^Yolo2OutputLayer this]
    (-> this (.gradientAndScore))))

