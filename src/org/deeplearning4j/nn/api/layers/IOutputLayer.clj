(ns org.deeplearning4j.nn.api.layers.IOutputLayer
  "Interface for output layers (those that calculate gradients with respect to a labels array)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.api.layers IOutputLayer]))

(defn needs-labels
  "Returns true if labels are required
  for this output layer

  returns: true if this output layer needs labels or not - `boolean`"
  (^Boolean [^IOutputLayer this]
    (-> this (.needsLabels))))

(defn set-labels
  "Set the labels array for this output layer

  labels - Labels array to set - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^IOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.setLabels labels))))

(defn get-labels
  "Get the labels array previously set with setLabels(INDArray)

  returns: Labels array, or null if it has not been set - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^IOutputLayer this]
    (-> this (.getLabels))))

(defn compute-score
  "Compute score after labels and input have been set.

  full-network-l-1 - L1 regularization term for the entire network - `double`
  full-network-l-2 - L2 regularization term for the entire network - `double`
  training - whether score should be calculated at train or test time (this affects things like application ofdropout, etc) - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: score (loss function) - `double`"
  (^Double [^IOutputLayer this ^Double full-network-l-1 ^Double full-network-l-2 ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeScore full-network-l-1 full-network-l-2 training workspace-mgr))))

(defn compute-score-for-examples
  "Compute the score for each example individually, after labels and input have been set.

  full-network-l-1 - L1 regularization term for the entire network (or, 0.0 to not include regularization) - `double`
  full-network-l-2 - L2 regularization term for the entire network (or, 0.0 to not include regularization) - `double`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: A column INDArray of shape [numExamples,1], where entry i is the score of the ith example - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^IOutputLayer this ^Double full-network-l-1 ^Double full-network-l-2 ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeScoreForExamples full-network-l-1 full-network-l-2 workspace-mgr))))

