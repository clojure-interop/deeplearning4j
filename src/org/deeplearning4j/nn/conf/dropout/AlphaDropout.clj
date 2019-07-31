(ns org.deeplearning4j.nn.conf.dropout.AlphaDropout
  "AlphaDropout is a dropout technique proposed by Klaumbauer et al. 2017 - Self-Normalizing Neural Networks
 https://arxiv.org/abs/1706.02515

 This dropout technique was designed specifically for self-normalizing neural networks - i.e., networks using
 ActivationSELU / Activation.SELU
 activation function, combined with the N(0,stdev=1/sqrt(fanIn)) \"SNN\" weight initialization,
 WeightInit.NORMAL

 In conjuction with the aforementioned activation function and weight initialization, AlphaDropout attempts to keep
 both the mean and variance of the post-dropout activations to the the same (in expectation) as before alpha
 dropout was applied.
 Specifically, AlphaDropout implements a * (x * d  alphaPrime * (1-d))  b, where d ~ Bernoulli(p), i.e., d \\in {0,1}.
 Where x is the input activations, a, b, alphaPrime are constants determined from the SELU alpha/lambda parameters.
 Users should use the default alpha/lambda values in virtually all cases.

 Dropout schedules (i.e., varying probability p as a function of iteration/epoch) are also supported."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.dropout AlphaDropout]))

(defn ->alpha-dropout
  "Constructor.

  activation-retain-probability - Probability of retaining an activation. See AlphaDropout javadoc - `double`"
  (^AlphaDropout [^Double activation-retain-probability]
    (new AlphaDropout activation-retain-probability)))

(def *-default-alpha
  "Static Constant.

  type: double"
  AlphaDropout/DEFAULT_ALPHA)

(def *-default-lambda
  "Static Constant.

  type: double"
  AlphaDropout/DEFAULT_LAMBDA)

(defn apply-dropout
  "input-activations - Input activations array - `org.nd4j.linalg.api.ndarray.INDArray`
  output - The result array (same as inputArray for in-place ops) for the post-dropout activations - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - Current iteration number - `int`
  epoch - Current epoch number - `int`
  workspace-mgr - Workspace manager, if any storage is required (use ArrayType.INPUT) - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (resultArray) after applying dropout - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AlphaDropout this ^org.nd4j.linalg.api.ndarray.INDArray input-activations ^org.nd4j.linalg.api.ndarray.INDArray output ^Integer iteration ^Integer epoch ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.applyDropout input-activations output iteration epoch workspace-mgr))))

(defn backprop
  "Description copied from interface: IDropout

  grad-at-output - Gradients at the output of the dropout op - i.e., dL/dOut - `org.nd4j.linalg.api.ndarray.INDArray`
  grad-at-input - Gradients at the input of the dropout op - i.e., dL/dIn. Use the same array as gradAtOutputto apply the backprop gradient in-place - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - Current iteration - `int`
  epoch - Current epoch - `int`

  returns: Same array as gradAtInput - i.e., gradient after backpropagating through dropout op - i.e., dL/dIn - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AlphaDropout this ^org.nd4j.linalg.api.ndarray.INDArray grad-at-output ^org.nd4j.linalg.api.ndarray.INDArray grad-at-input ^Integer iteration ^Integer epoch]
    (-> this (.backprop grad-at-output grad-at-input iteration epoch))))

(defn clear
  "Description copied from interface: IDropout"
  ([^AlphaDropout this]
    (-> this (.clear))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.dropout.AlphaDropout`"
  (^org.deeplearning4j.nn.conf.dropout.AlphaDropout [^AlphaDropout this]
    (-> this (.clone))))

(defn a
  "p - `double`

  returns: `double`"
  (^Double [^AlphaDropout this ^Double p]
    (-> this (.a p))))

(defn b
  "p - `double`

  returns: `double`"
  (^Double [^AlphaDropout this ^Double p]
    (-> this (.b p))))

