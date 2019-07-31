(ns org.deeplearning4j.optimize.api.LineOptimizer
  "Line optimizer interface adapted from mallet"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.api LineOptimizer]))

(defn optimize
  "Line optimizer

  parameters - the parameters to optimize - `org.nd4j.linalg.api.ndarray.INDArray`
  gradient - the gradient - `org.nd4j.linalg.api.ndarray.INDArray`
  search-direction - the point/direction to go in - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the last step size used - `double`

  throws: org.deeplearning4j.exception.InvalidStepException"
  (^Double [^LineOptimizer this ^org.nd4j.linalg.api.ndarray.INDArray parameters ^org.nd4j.linalg.api.ndarray.INDArray gradient ^org.nd4j.linalg.api.ndarray.INDArray search-direction ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.optimize parameters gradient search-direction workspace-mgr))))

