(ns org.deeplearning4j.nn.modelimport.keras.preprocessors.PermutePreprocessor
  "Preprocessor to permute input data according to specified permutation indices."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.preprocessors PermutePreprocessor]))

(defn ->permute-preprocessor
  "Constructor.

  permutation-indices - `int[]`"
  (^PermutePreprocessor [permutation-indices]
    (new PermutePreprocessor permutation-indices)))

(defn pre-process
  "Description copied from interface: InputPreProcessor

  input - the input to pre preProcess - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the processed input. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^PermutePreprocessor this ^org.nd4j.linalg.api.ndarray.INDArray input ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.preProcess input mini-batch-size workspace-mgr))))

(defn backprop
  "Description copied from interface: InputPreProcessor

  output - which is a pair of the gradient and epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  mini-batch-size - Minibatch size - `int`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the reverse of the pre preProcess step (if any). Note that the returned array should be
  placed in ArrayType.ACTIVATION_GRAD workspace via the
  workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^PermutePreprocessor this ^org.nd4j.linalg.api.ndarray.INDArray output ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backprop output mini-batch-size workspace-mgr))))

(defn get-output-type
  "Description copied from interface: InputPreProcessor

  input-type - Type of input for the preprocessor - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of input after applying the preprocessor - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.conf.inputs.InvalidInputTypeException"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^PermutePreprocessor this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

