(ns org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf MultiLayerConfiguration$Builder]))

(defn ->builder
  "Constructor."
  (^MultiLayerConfiguration$Builder []
    (new MultiLayerConfiguration$Builder )))

(defn confs
  "confs - `java.util.List`

  returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder [^MultiLayerConfiguration$Builder this ^java.util.List confs]
    (-> this (.confs confs))))

(defn set-input-type
  "input-type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder [^MultiLayerConfiguration$Builder this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.setInputType input-type))))

(defn t-bptt-length
  "When doing truncated BPTT: how many steps should we do?
  Only applicable when doing backpropType(BackpropType.TruncatedBPTT)
  See: http://www.cs.utoronto.ca/~ilya/pubs/ilya_sutskever_phd_thesis.pdf

  bptt-length - length > 0 - `int`

  returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder [^MultiLayerConfiguration$Builder this ^Integer bptt-length]
    (-> this (.tBPTTLength bptt-length))))

(defn pretrain
  "Whether to do pre train or not

  pretrain - whether to do pre train or not - `boolean`

  returns: builder pattern - `org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder [^MultiLayerConfiguration$Builder this ^Boolean pretrain]
    (-> this (.pretrain pretrain))))

(defn training-workspace-mode
  "Deprecated. Use NeuralNetConfiguration.Builder.trainingWorkspaceMode(WorkspaceMode)

  workspace-mode - `org.deeplearning4j.nn.conf.WorkspaceMode`

  returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder [^MultiLayerConfiguration$Builder this ^org.deeplearning4j.nn.conf.WorkspaceMode workspace-mode]
    (-> this (.trainingWorkspaceMode workspace-mode))))

(defn inference-workspace-mode
  "Deprecated. Use NeuralNetConfiguration.Builder.inferenceWorkspaceMode(WorkspaceMode)

  workspace-mode - `org.deeplearning4j.nn.conf.WorkspaceMode`

  returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder [^MultiLayerConfiguration$Builder this ^org.deeplearning4j.nn.conf.WorkspaceMode workspace-mode]
    (-> this (.inferenceWorkspaceMode workspace-mode))))

(defn backprop
  "Whether to do back prop or not

  backprop - whether to do back prop or not - `boolean`

  returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder [^MultiLayerConfiguration$Builder this ^Boolean backprop]
    (-> this (.backprop backprop))))

(defn input-pre-processor
  "Specify the processors.
  These are used at each layer for doing things like normalization and
  shaping of input.

  layer - `java.lang.Integer`
  processor - what to use to preProcess the data. - `org.deeplearning4j.nn.conf.InputPreProcessor`

  returns: builder pattern - `org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder [^MultiLayerConfiguration$Builder this ^java.lang.Integer layer ^org.deeplearning4j.nn.conf.InputPreProcessor processor]
    (-> this (.inputPreProcessor layer processor))))

(defn t-bptt-forward-length
  "When doing truncated BPTT: how many steps of forward pass should we do
  before doing (truncated) backprop?
  Only applicable when doing backpropType(BackpropType.TruncatedBPTT)
  Typically tBPTTForwardLength parameter is same as the tBPTTBackwardLength parameter,
  but may be larger than it in some circumstances (but never smaller)
  Ideally your training data time series length should be divisible by this
  This is the k1 parameter on pg23 of
  http://www.cs.utoronto.ca/~ilya/pubs/ilya_sutskever_phd_thesis.pdf

  forward-length - Forward length > 0, >= backwardLength - `int`

  returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder [^MultiLayerConfiguration$Builder this ^Integer forward-length]
    (-> this (.tBPTTForwardLength forward-length))))

(defn t-bptt-backward-length
  "When doing truncated BPTT: how many steps of backward should we do?
  Only applicable when doing backpropType(BackpropType.TruncatedBPTT)
  This is the k2 parameter on pg23 of
  http://www.cs.utoronto.ca/~ilya/pubs/ilya_sutskever_phd_thesis.pdf

  backward-length - <= forwardLength - `int`

  returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder [^MultiLayerConfiguration$Builder this ^Integer backward-length]
    (-> this (.tBPTTBackwardLength backward-length))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration [^MultiLayerConfiguration$Builder this]
    (-> this (.build))))

(defn input-pre-processors
  "processors - `java.util.Map`

  returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder [^MultiLayerConfiguration$Builder this ^java.util.Map processors]
    (-> this (.inputPreProcessors processors))))

(defn cache-mode
  "This method defines how/if preOutput cache is handled:
  NONE: cache disabled (default value)
  HOST: Host memory will be used
  DEVICE: GPU memory will be used (on CPU backends effect will be the same as for HOST)

  cache-mode - `org.deeplearning4j.nn.conf.CacheMode`

  returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder [^MultiLayerConfiguration$Builder this ^org.deeplearning4j.nn.conf.CacheMode cache-mode]
    (-> this (.cacheMode cache-mode))))

(defn backprop-type
  "The type of backprop. Default setting is used for most networks (MLP, CNN etc),
  but optionally truncated BPTT can be used for training recurrent neural networks.
  If using TruncatedBPTT make sure you set both tBPTTForwardLength() and tBPTTBackwardLength()

  type - `org.deeplearning4j.nn.conf.BackpropType`

  returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration$Builder [^MultiLayerConfiguration$Builder this ^org.deeplearning4j.nn.conf.BackpropType type]
    (-> this (.backpropType type))))

