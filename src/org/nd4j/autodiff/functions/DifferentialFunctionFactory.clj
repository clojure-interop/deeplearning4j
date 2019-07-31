(ns org.nd4j.autodiff.functions.DifferentialFunctionFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.functions DifferentialFunctionFactory]))

(defn ->differential-function-factory
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`"
  (^DifferentialFunctionFactory [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new DifferentialFunctionFactory same-diff)))

(defn hard-sigmoid
  "in - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.hardSigmoid in))))

(defn random-normal
  "mean - `double`
  std - `double`
  shape - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^Double mean ^Double std ^org.nd4j.autodiff.samediff.SDVariable shape]
    (-> this (.randomNormal mean std shape))))

(defn hamming-distance
  "ix - `org.nd4j.autodiff.samediff.SDVariable`
  iy - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ix ^org.nd4j.autodiff.samediff.SDVariable iy ^Integer dimensions]
    (-> this (.hammingDistance ix iy dimensions))))

(defn norm-2-bp
  "pre-reduce-in - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable pre-reduce-in ^org.nd4j.autodiff.samediff.SDVariable grad ^Boolean keep-dims ^Integer dimensions]
    (-> this (.norm2Bp pre-reduce-in grad keep-dims dimensions))))

(defn tile-bp
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  repeat - `int[]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.autodiff.samediff.SDVariable grad repeat]
    (-> this (.tileBp in grad repeat))))

(defn tanh-derivative
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  wrt - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable wrt]
    (-> this (.tanhDerivative i-x wrt))))

(defn invoke
  "name - `java.lang.String`
  args - `java.lang.Object[]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^java.lang.String name args]
    (-> this (.invoke name args))))

(defn space-to-batch
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  blocks - `int[]`
  padding - `int[][]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function blocks padding]
    (-> this (.spaceToBatch differential-function blocks padding))))

(defn softsign-derivative
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.softsignDerivative i-x))))

(defn floor
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.floor i-x))))

(defn swish-derivative
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.swishDerivative i-x))))

(defn invert-permutation
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^Boolean in-place]
    (-> this (.invertPermutation input in-place))))

(defn rdiv-bp
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable grad]
    (-> this (.rdivBp x y grad))))

(defn log-1p
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.log1p i-x))))

(defn im-2-col
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (-> this (.im2Col input config))))

(defn ceil
  "x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.ceil x))))

(defn log-softmax-derivative
  "arg - `org.nd4j.autodiff.samediff.SDVariable`
  wrt - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable arg ^org.nd4j.autodiff.samediff.SDVariable wrt]
    (-> this (.logSoftmaxDerivative arg wrt))))

(defn random-normal-truncated
  "mean - `double`
  stdev - `double`
  shape - `long`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^Double mean ^Double stdev ^Long shape]
    (-> this (.randomNormalTruncated mean stdev shape))))

(defn deconv-2d
  "Deconv2d operation.

  inputs - the inputs to conv2d - `org.nd4j.autodiff.samediff.SDVariable[]`
  deconv-2-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.DeConv2DConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this inputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.DeConv2DConfig deconv-2-d-config]
    (-> this (.deconv2d inputs deconv-2-d-config))))

(defn moments
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  axes - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^Integer axes]
    (-> this (.moments input axes))))

(defn range
  "from - `double`
  to - `double`
  step - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^Double from ^Double to ^Double step]
    (-> this (.range from to step))))

(defn diag
  "sd-variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable sd-variable]
    (-> this (.diag sd-variable))))

(defn random-binomial
  "n-trials - `int`
  p - `double`
  shape - `long`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^Integer n-trials ^Double p ^Long shape]
    (-> this (.randomBinomial n-trials p shape))))

(defn set-diag
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  diag - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.autodiff.samediff.SDVariable diag]
    (-> this (.setDiag in diag))))

(defn cosh
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.cosh i-x))))

(defn selu
  "arg - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable arg]
    (-> this (.selu arg))))

(defn sigmoid-derivative
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  wrt - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable wrt]
    (-> this (.sigmoidDerivative i-x wrt))))

(defn loss-kld
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.lossKLD i-x i-y dimensions))))

(defn batch-to-space
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  blocks - `int[]`
  crops - `int[][]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function blocks crops]
    (-> this (.batchToSpace differential-function blocks crops))))

(defn min
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Boolean keep-dims ^Integer dimensions]
    (-> this (.min i-x keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable first ^org.nd4j.autodiff.samediff.SDVariable second]
    (-> this (.min first second))))

(defn elu-derivative
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.eluDerivative i-x))))

(defn conv-3d
  "Conv3d operation.

  inputs - the inputs to conv3d - `org.nd4j.autodiff.samediff.SDVariable[]`
  conv-3-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv3DConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this inputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv3DConfig conv-3-d-config]
    (-> this (.conv3d inputs conv-3-d-config))))

(defn add-bp
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable grad]
    (-> this (.addBp x y grad))))

(defn scatter-max
  "ref - `org.nd4j.autodiff.samediff.SDVariable`
  indices - `org.nd4j.autodiff.samediff.SDVariable`
  updates - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterMax ref indices updates))))

(defn rdivi
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (-> this (.rdivi differential-function i-v))))

(defn assign
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y]
    (-> this (.assign x y))))

(defn hard-tanh
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.hardTanh i-x))))

(defn iamin
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean keep-dims ^Integer dimensions]
    (-> this (.iamin in keep-dims dimensions))))

(defn cumprod-bp
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  exclusive - `boolean`
  reverse - `boolean`
  axis - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.autodiff.samediff.SDVariable grad ^Boolean exclusive ^Boolean reverse ^Integer axis]
    (-> this (.cumprodBp in grad exclusive reverse axis))))

(defn jaccard-distance
  "ix - `org.nd4j.autodiff.samediff.SDVariable`
  iy - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ix ^org.nd4j.autodiff.samediff.SDVariable iy ^Integer dimensions]
    (-> this (.jaccardDistance ix iy dimensions))))

(defn std
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  bias-corrected - `boolean`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Boolean bias-corrected ^Boolean keep-dims ^Integer dimensions]
    (-> this (.std i-x bias-corrected keep-dims dimensions))))

(defn lt
  "function-input - `org.nd4j.autodiff.samediff.SDVariable`
  function-input-1 - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable function-input ^org.nd4j.autodiff.samediff.SDVariable function-input-1]
    (-> this (.lt function-input function-input-1))))

(defn neq
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Double i-y]
    (-> this (.neq i-x i-y))))

(defn squeeze
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  axis - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Integer axis]
    (-> this (.squeeze i-x axis))))

(defn truncated-div
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (-> this (.truncatedDiv differential-function i-v))))

(defn loss-l-1
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.lossL1 i-x i-y dimensions))))

(defn is-non-decreasing
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.isNonDecreasing i-x))))

(defn rsqrt
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.rsqrt i-x))))

(defn sub
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (-> this (.sub differential-function i-v))))

(defn matrix-inverse
  "in - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.matrixInverse in))))

(defn log-softmax
  "i-v - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (-> this (.logSoftmax i-v))))

(defn variance-bp
  "std-input - `org.nd4j.autodiff.samediff.SDVariable`
  gradient - `org.nd4j.autodiff.samediff.SDVariable`
  bias-corrected - `boolean`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable std-input ^org.nd4j.autodiff.samediff.SDVariable gradient ^Boolean bias-corrected ^Boolean keep-dims ^Integer dimensions]
    (-> this (.varianceBp std-input gradient bias-corrected keep-dims dimensions))))

(defn cube-derivative
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.cubeDerivative i-x))))

(defn depth-wise-conv-2d
  "Depth-wise Conv2d operation. This is just separable convolution with
  only the depth-wise weights specified.

  inputs - the inputs to conv2d - `org.nd4j.autodiff.samediff.SDVariable[]`
  depth-conv-2-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this inputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig depth-conv-2-d-config]
    (-> this (.depthWiseConv2d inputs depth-conv-2-d-config))))

(defn segment-mean
  "data - `org.nd4j.autodiff.samediff.SDVariable`
  segment-ids - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (-> this (.segmentMean data segment-ids))))

(defn cosine-similarity
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.cosineSimilarity i-x i-y dimensions))))

(defn cosine-distance
  "ix - `org.nd4j.autodiff.samediff.SDVariable`
  iy - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ix ^org.nd4j.autodiff.samediff.SDVariable iy ^Integer dimensions]
    (-> this (.cosineDistance ix iy dimensions))))

(defn unstack
  "value - `org.nd4j.autodiff.samediff.SDVariable`
  axis - `int`
  num - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable value ^Integer axis ^Integer num]
    (-> this (.unstack value axis num)))
  ([^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable value ^Integer axis]
    (-> this (.unstack value axis))))

(defn first-index
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition ^Boolean keep-dims ^Integer dimensions]
    (-> this (.firstIndex in condition keep-dims dimensions))))

(defn relu-6
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  cutoff - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Double cutoff]
    (-> this (.relu6 i-x cutoff))))

(defn lt-or-eqi
  "function-input - `org.nd4j.autodiff.samediff.SDVariable`
  function-input-1 - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable function-input ^org.nd4j.autodiff.samediff.SDVariable function-input-1]
    (-> this (.ltOrEqi function-input function-input-1))))

(defn loss-hinge
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.lossHinge i-x i-y dimensions))))

(defn leaky-relu
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  alpha - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Double alpha]
    (-> this (.leakyRelu i-x alpha))))

(defn shape
  "df - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable df]
    (-> this (.shape df))))

(defn scatter-div
  "ref - `org.nd4j.autodiff.samediff.SDVariable`
  indices - `org.nd4j.autodiff.samediff.SDVariable`
  updates - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterDiv ref indices updates))))

(defn erfc
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function]
    (-> this (.erfc differential-function))))

(defn pooling-3d
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  pooling-3-d-config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig pooling-3-d-config]
    (-> this (.pooling3d input pooling-3-d-config))))

(defn confusion-matrix
  "labels - `org.nd4j.autodiff.samediff.SDVariable`
  pred - `org.nd4j.autodiff.samediff.SDVariable`
  num-classes - `java.lang.Integer`
  weights - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable labels ^org.nd4j.autodiff.samediff.SDVariable pred ^java.lang.Integer num-classes ^org.nd4j.autodiff.samediff.SDVariable weights]
    (-> this (.confusionMatrix labels pred num-classes weights)))
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable labels ^org.nd4j.autodiff.samediff.SDVariable pred ^java.lang.Integer num-classes]
    (-> this (.confusionMatrix labels pred num-classes)))
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable labels ^org.nd4j.autodiff.samediff.SDVariable pred]
    (-> this (.confusionMatrix labels pred))))

(defn iamax
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean keep-dims ^Integer dimensions]
    (-> this (.iamax in keep-dims dimensions))))

(defn constant
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^Long shape]
    (-> this (.constant input shape))))

(defn bias-add
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  bias - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable bias]
    (-> this (.biasAdd input bias))))

(defn eq
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y]
    (-> this (.eq i-x i-y))))

(defn atan-2
  "y - `org.nd4j.autodiff.samediff.SDVariable`
  x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable x]
    (-> this (.atan2 y x))))

(defn min-bp
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable grad ^Boolean keep-dims ^Integer dimensions]
    (-> this (.minBp i-x grad keep-dims dimensions))))

(defn squared-norm
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^Boolean keep-dims ^Integer dimensions]
    (-> this (.squaredNorm input keep-dims dimensions))))

(defn rsubi
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (-> this (.rsubi differential-function i-v))))

(defn argmax
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean keep-dims ^Integer dimensions]
    (-> this (.argmax in keep-dims dimensions))))

(defn tanh-rational-derivative
  "in - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.tanhRationalDerivative in))))

(defn mean
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean keep-dims ^Integer dimensions]
    (-> this (.mean in keep-dims dimensions))))

(defn squared-norm-bp
  "pre-reduce-input - `org.nd4j.autodiff.samediff.SDVariable`
  gradient - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable pre-reduce-input ^org.nd4j.autodiff.samediff.SDVariable gradient ^Boolean keep-dims ^Integer dimensions]
    (-> this (.squaredNormBp pre-reduce-input gradient keep-dims dimensions))))

(defn noop
  "input - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.noop input))))

(defn segment-sum
  "data - `org.nd4j.autodiff.samediff.SDVariable`
  segment-ids - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (-> this (.segmentSum data segment-ids))))

(defn gather-nd
  "df - `org.nd4j.autodiff.samediff.SDVariable`
  indices - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable df ^org.nd4j.autodiff.samediff.SDVariable indices]
    (-> this (.gatherNd df indices))))

(defn pow-derivative
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  pow - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Double pow]
    (-> this (.powDerivative i-x pow))))

(defn var
  "i-name - `java.lang.String`
  i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^java.lang.String i-name ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.var i-name i-x))))

(defn prod
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Boolean keep-dims ^Integer dimensions]
    (-> this (.prod i-x keep-dims dimensions))))

(defn sum
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Boolean keep-dims ^Integer dimensions]
    (-> this (.sum i-x keep-dims dimensions))))

(defn is-numeric-tensor
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.isNumericTensor i-x))))

(defn parallel-stack
  "values - `org.nd4j.autodiff.samediff.SDVariable[]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this values]
    (-> this (.parallel_stack values))))

(defn reverse
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^Integer dimensions]
    (-> this (.reverse x dimensions))))

(defn normalize-moments
  "counts - `org.nd4j.autodiff.samediff.SDVariable`
  means - `org.nd4j.autodiff.samediff.SDVariable`
  variances - `org.nd4j.autodiff.samediff.SDVariable`
  shift - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable counts ^org.nd4j.autodiff.samediff.SDVariable means ^org.nd4j.autodiff.samediff.SDVariable variances ^Double shift]
    (-> this (.normalizeMoments counts means variances shift))))

(defn dot
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^Integer dimensions]
    (-> this (.dot x y dimensions))))

(defn softmax-cross-entropy-with-logits
  "logits - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`
  labels - `org.nd4j.autodiff.samediff.SDVariable`
  reduction-mode - `int`
  label-smoothing - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable logits ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable labels ^Integer reduction-mode ^Double label-smoothing]
    (-> this (.softmaxCrossEntropyWithLogits logits weights labels reduction-mode label-smoothing))))

(defn normmax-bp
  "pre-reduce-in - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable pre-reduce-in ^org.nd4j.autodiff.samediff.SDVariable grad ^Boolean keep-dims ^Integer dimensions]
    (-> this (.normmaxBp pre-reduce-in grad keep-dims dimensions))))

(defn max-pooling-3d
  "Max pooling 3d operation.

  input - the inputs to pooling - `org.nd4j.autodiff.samediff.SDVariable`
  pooling-3-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig pooling-3-d-config]
    (-> this (.maxPooling3d input pooling-3-d-config))))

(defn trace
  "in - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.trace in))))

(defn elu
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.elu i-x))))

(defn cross
  "a - `org.nd4j.autodiff.samediff.SDVariable`
  b - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable a ^org.nd4j.autodiff.samediff.SDVariable b]
    (-> this (.cross a b))))

(defn eqi
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Double i-y]
    (-> this (.eqi i-x i-y))))

(defn cumprod
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  exclusive - `boolean`
  reverse - `boolean`
  axis - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean exclusive ^Boolean reverse ^Integer axis]
    (-> this (.cumprod in exclusive reverse axis))))

(defn repeat
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  axis - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Integer axis]
    (-> this (.repeat i-x axis))))

(defn validate-differential-function-graph
  "function - `org.nd4j.autodiff.samediff.SDVariable`"
  ([^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable function]
    (-> this (.validateDifferentialFunctionGraph function))))

(defn gtei
  "function-input - `org.nd4j.autodiff.samediff.SDVariable`
  function-input-1 - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable function-input ^org.nd4j.autodiff.samediff.SDVariable function-input-1]
    (-> this (.gtei function-input function-input-1))))

(defn matrix-determinant
  "in - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.matrixDeterminant in))))

(defn roll-axis
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  axis - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Integer axis]
    (-> this (.rollAxis i-x axis))))

(defn max
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Boolean keep-dims ^Integer dimensions]
    (-> this (.max i-x keep-dims dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable first ^org.nd4j.autodiff.samediff.SDVariable second]
    (-> this (.max first second))))

(defn linspace
  "lower - `double`
  upper - `double`
  count - `long`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^Double lower ^Double upper ^Long count]
    (-> this (.linspace lower upper count))))

(defn muli
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (-> this (.muli differential-function i-v))))

(defn scatter-sub
  "ref - `org.nd4j.autodiff.samediff.SDVariable`
  indices - `org.nd4j.autodiff.samediff.SDVariable`
  updates - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterSub ref indices updates))))

(defn bias-add-bp
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  bias - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable bias ^org.nd4j.autodiff.samediff.SDVariable grad]
    (-> this (.biasAddBp input bias grad))))

(defn diag-part
  "sd-variable - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable sd-variable]
    (-> this (.diagPart sd-variable))))

(defn floor-div
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y]
    (-> this (.floorDiv x y))))

(defn mmul
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  m-mul-transpose - `org.nd4j.linalg.api.blas.params.MMulTranspose`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.linalg.api.blas.params.MMulTranspose m-mul-transpose]
    (-> this (.mmul x y m-mul-transpose)))
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y]
    (-> this (.mmul x y))))

(defn sigmoid
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.sigmoid i-x))))

(defn ones-like
  "name - `java.lang.String`
  input - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.onesLike name input))))

(defn last-index
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition ^Boolean keep-dims ^Integer dimensions]
    (-> this (.lastIndex in condition keep-dims dimensions))))

(defn im-2-col-bp
  "im-2col-input - `org.nd4j.autodiff.samediff.SDVariable`
  gradient-at-output - `org.nd4j.autodiff.samediff.SDVariable`
  config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable im-2col-input ^org.nd4j.autodiff.samediff.SDVariable gradient-at-output ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (-> this (.im2ColBp im-2col-input gradient-at-output config))))

(defn loss-mse
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.lossMSE i-x i-y dimensions))))

(defn reciprocal
  "a - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable a]
    (-> this (.reciprocal a))))

(defn loss-mae
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.lossMAE i-x i-y dimensions))))

(defn onehot
  "indices - `org.nd4j.autodiff.samediff.SDVariable`
  depth - `int`
  axis - `int`
  on - `double`
  off - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable indices ^Integer depth ^Integer axis ^Double on ^Double off]
    (-> this (.onehot indices depth axis on off)))
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable indices ^Integer depth]
    (-> this (.onehot indices depth))))

(defn pow
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Double i-y]
    (-> this (.pow i-x i-y))))

(defn permute
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Integer dimensions]
    (-> this (.permute i-x dimensions))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DifferentialFunctionFactory this]
    (-> this (.toString))))

(defn clip-by-value
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  clip-value-min - `double`
  clip-value-max - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^Double clip-value-min ^Double clip-value-max]
    (-> this (.clipByValue x clip-value-min clip-value-max))))

(defn random-bernoulli
  "p - `double`
  shape - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^Double p ^org.nd4j.autodiff.samediff.SDVariable shape]
    (-> this (.randomBernoulli p shape))))

(defn argmin
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean keep-dims ^Integer dimensions]
    (-> this (.argmin in keep-dims dimensions))))

(defn scatter-min
  "ref - `org.nd4j.autodiff.samediff.SDVariable`
  indices - `org.nd4j.autodiff.samediff.SDVariable`
  updates - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterMin ref indices updates))))

(defn zero
  "shape - `int[]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this shape]
    (-> this (.zero shape))))

(defn gradient-backwards-marker
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.gradientBackwardsMarker i-x))))

(defn rank
  "df - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable df]
    (-> this (.rank df))))

(defn norm-1-bp
  "pre-reduce-in - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable pre-reduce-in ^org.nd4j.autodiff.samediff.SDVariable grad ^Boolean keep-dims ^Integer dimensions]
    (-> this (.norm1Bp pre-reduce-in grad keep-dims dimensions))))

(defn atan
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.atan i-x))))

(defn gt
  "function-input - `org.nd4j.autodiff.samediff.SDVariable`
  function-input-1 - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable function-input ^org.nd4j.autodiff.samediff.SDVariable function-input-1]
    (-> this (.gt function-input function-input-1))))

(defn std-bp
  "std-input - `org.nd4j.autodiff.samediff.SDVariable`
  gradient - `org.nd4j.autodiff.samediff.SDVariable`
  bias-corrected - `boolean`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable std-input ^org.nd4j.autodiff.samediff.SDVariable gradient ^Boolean bias-corrected ^Boolean keep-dims ^Integer dimensions]
    (-> this (.stdBp std-input gradient bias-corrected keep-dims dimensions))))

(defn conv-1d
  "Conv1d operation.

  input - the inputs to conv1d - `org.nd4j.autodiff.samediff.SDVariable`
  weights - conv1d weights - `org.nd4j.autodiff.samediff.SDVariable`
  conv-1-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv1DConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv1DConfig conv-1-d-config]
    (-> this (.conv1d input weights conv-1-d-config))))

(defn loss-msle
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.lossMSLE i-x i-y dimensions))))

(defn log
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  base - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Double base]
    (-> this (.log in base)))
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.log i-x))))

(defn zeros-like
  "name - `java.lang.String`
  input - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^java.lang.String name ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.zerosLike name input)))
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.zerosLike input))))

(defn acosh
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.acosh i-x))))

(defn gte
  "function-input - `org.nd4j.autodiff.samediff.SDVariable`
  function-input-1 - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable function-input ^org.nd4j.autodiff.samediff.SDVariable function-input-1]
    (-> this (.gte function-input function-input-1))))

(defn reduction-broadcastable-with-orig-shape
  "Add 1s as required to the array make an array possible to be broadcast with the original (pre-reduce) array.

  Example: if doing [a,b,c].sum(1), result is [a,c]. To 'undo' this in a way that can be auto-broadcast,
  we want to expand as required - i.e., [a,c] -> [a,1,c] which can be auto-broadcast with the original [a,b,c].
  This is typically only used with reduction operations backprop.

  orig-rank - Rank of the original array, before the reduction was executed - `int`
  reduce-dims - Dimensions that the original array was reduced from - `int[]`
  to-expand - Array to add 1s to the shape to (such that it can be - `org.nd4j.autodiff.samediff.SDVariable`

  returns: Reshaped array. - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^Integer orig-rank reduce-dims ^org.nd4j.autodiff.samediff.SDVariable to-expand]
    (-> this (.reductionBroadcastableWithOrigShape orig-rank reduce-dims to-expand))))

(defn hard-tanh-derivative
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.hardTanhDerivative i-x))))

(defn size-at
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  dimension - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimension]
    (-> this (.sizeAt in dimension))))

(defn count-non-zero
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^Integer dimensions]
    (-> this (.countNonZero input dimensions))))

(defn gather
  "df - `org.nd4j.autodiff.samediff.SDVariable`
  indices - `int[]`
  axis - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable df indices ^Integer axis]
    (-> this (.gather df indices axis))))

(defn any
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^Integer dimensions]
    (-> this (.any input dimensions))))

(defn reshape
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x shape]
    (-> this (.reshape i-x shape))))

(defn cumsum-bp
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  exclusive - `boolean`
  reverse - `boolean`
  axis - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.autodiff.samediff.SDVariable grad ^Boolean exclusive ^Boolean reverse ^Integer axis]
    (-> this (.cumsumBp in grad exclusive reverse axis))))

(defn space-to-depth
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  blocks-size - `int`
  data-format - `java.lang.String`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^Integer blocks-size ^java.lang.String data-format]
    (-> this (.spaceToDepth differential-function blocks-size data-format))))

(defn cube
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.cube i-x))))

(defn norm-1
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Boolean keep-dims ^Integer dimensions]
    (-> this (.norm1 i-x keep-dims dimensions))))

(defn sin
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.sin i-x))))

(defn scalar-min
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  num - `java.lang.Number`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^java.lang.Number num]
    (-> this (.scalarMin in num))))

(defn is-infinite
  "ix - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ix]
    (-> this (.isInfinite ix))))

(defn scatter-add
  "ref - `org.nd4j.autodiff.samediff.SDVariable`
  indices - `org.nd4j.autodiff.samediff.SDVariable`
  updates - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterAdd ref indices updates))))

(defn relu-layer
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`
  bias - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable bias]
    (-> this (.reluLayer input weights bias))))

(defn dot-bp
  "in-1 - `org.nd4j.autodiff.samediff.SDVariable`
  in-2 - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in-1 ^org.nd4j.autodiff.samediff.SDVariable in-2 ^org.nd4j.autodiff.samediff.SDVariable grad ^Boolean keep-dims ^Integer dimensions]
    (-> this (.dotBp in-1 in-2 grad keep-dims dimensions))))

(defn match-condition-count
  "Returns a count of the number of elements that satisfy the condition

  in - Input - `org.nd4j.autodiff.samediff.SDVariable`
  condition - Condition - `org.nd4j.linalg.indexing.conditions.Condition`
  keep-dims - `boolean`
  dimensions - `int`

  returns: Number of elements that the condition is satisfied for - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition ^Boolean keep-dims ^Integer dimensions]
    (-> this (.matchConditionCount in condition keep-dims dimensions))))

(defn loss-cosine-similarity
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.lossCosineSimilarity i-x i-y dimensions))))

(defn tile
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  repeat - `int[]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x repeat]
    (-> this (.tile i-x repeat))))

(defn broadcast
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Integer shape]
    (-> this (.broadcast i-x shape))))

(defn log-sigmoid
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.logSigmoid i-x))))

(defn dynamic-stitch
  "indices - `org.nd4j.autodiff.samediff.SDVariable[]`
  differential-functions - `org.nd4j.autodiff.samediff.SDVariable[]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this indices differential-functions]
    (-> this (.dynamicStitch indices differential-functions))))

(defn col-2-im
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (-> this (.col2Im input config))))

(defn exp
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.exp i-x))))

(defn tanh-rectified
  "in - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.tanhRectified in))))

(defn leaky-relu-derivative
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  cutoff - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Double cutoff]
    (-> this (.leakyReluDerivative i-x cutoff))))

(defn validate-differential-functionsame-diff
  "function - `org.nd4j.autodiff.samediff.SDVariable`"
  ([^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable function]
    (-> this (.validateDifferentialFunctionsameDiff function))))

(defn or
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y]
    (-> this (.or i-x i-y))))

(defn identity
  "input - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.identity input))))

(defn neg
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.neg i-x))))

(defn divi
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (-> this (.divi differential-function i-v))))

(defn entropy
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.entropy in dimensions))))

(defn fill
  "shape - `org.nd4j.autodiff.samediff.SDVariable`
  value - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable shape ^Double value]
    (-> this (.fill shape value))))

(defn neqi
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Double i-y]
    (-> this (.neqi i-x i-y))))

(defn ltei
  "function-input - `org.nd4j.autodiff.samediff.SDVariable`
  function-input-1 - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable function-input ^Double function-input-1]
    (-> this (.ltei function-input function-input-1))))

(defn scalar-set
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  num - `java.lang.Number`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^java.lang.Number num]
    (-> this (.scalarSet in num))))

(defn softsign
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.softsign i-x))))

(defn scatter-update
  "ref - `org.nd4j.autodiff.samediff.SDVariable`
  indices - `org.nd4j.autodiff.samediff.SDVariable`
  updates - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterUpdate ref indices updates))))

(defn div-bp
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable grad]
    (-> this (.divBp x y grad))))

(defn erf
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function]
    (-> this (.erf differential-function))))

(defn xw-plus-b
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`
  bias - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable bias]
    (-> this (.xwPlusB input weights bias))))

(defn replace-where
  "to - `org.nd4j.autodiff.samediff.SDVariable`
  from - `org.nd4j.autodiff.samediff.SDVariable`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable to ^org.nd4j.autodiff.samediff.SDVariable from ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.replaceWhere to from condition))))

(defn external-errors
  "external-gradients - `java.util.Map`
  inputs - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.linalg.api.ops.impl.transforms.temp.ExternalErrorsFunction`"
  (^org.nd4j.linalg.api.ops.impl.transforms.temp.ExternalErrorsFunction [^DifferentialFunctionFactory this ^java.util.Map external-gradients ^org.nd4j.autodiff.samediff.SDVariable inputs]
    (-> this (.externalErrors external-gradients inputs)))
  (^org.nd4j.linalg.api.ops.impl.transforms.temp.ExternalErrorsFunction [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable inputs]
    (-> this (.externalErrors inputs))))

(defn merge-add
  "differential-functions - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-functions]
    (-> this (.mergeAdd differential-functions))))

(defn sconv-2d
  "Separable Conv2d operation.

  inputs - the inputs to conv2d - `org.nd4j.autodiff.samediff.SDVariable[]`
  conv-2-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this inputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig conv-2-d-config]
    (-> this (.sconv2d inputs conv-2-d-config))))

(defn conv-2d
  "Conv2d operation.

  inputs - the inputs to conv2d - `org.nd4j.autodiff.samediff.SDVariable[]`
  conv-2-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this inputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig conv-2-d-config]
    (-> this (.conv2d inputs conv-2-d-config))))

(defn upsampling-2d-bp
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  gradient - `org.nd4j.autodiff.samediff.SDVariable`
  nchw - `boolean`
  scale-h - `int`
  scale-w - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable gradient ^Boolean nchw ^Integer scale-h ^Integer scale-w]
    (-> this (.upsampling2dBp input gradient nchw scale-h scale-w))))

(defn sqrt
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.sqrt i-x))))

(defn concat
  "dimension - `int`
  inputs - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^Integer dimension ^org.nd4j.autodiff.samediff.SDVariable inputs]
    (-> this (.concat dimension inputs))))

(defn batch-mmul
  "matrices-a - `org.nd4j.autodiff.samediff.SDVariable[]`
  matrices-b - `org.nd4j.autodiff.samediff.SDVariable[]`
  transpose-a - `boolean`
  transpose-b - `boolean`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^DifferentialFunctionFactory this matrices-a matrices-b ^Boolean transpose-a ^Boolean transpose-b]
    (-> this (.batchMmul matrices-a matrices-b transpose-a transpose-b)))
  ([^DifferentialFunctionFactory this matrices ^Boolean transpose-a ^Boolean transpose-b]
    (-> this (.batchMmul matrices transpose-a transpose-b)))
  ([^DifferentialFunctionFactory this matrices-a matrices-b]
    (-> this (.batchMmul matrices-a matrices-b))))

(defn scatter-mul
  "ref - `org.nd4j.autodiff.samediff.SDVariable`
  indices - `org.nd4j.autodiff.samediff.SDVariable`
  updates - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ref ^org.nd4j.autodiff.samediff.SDVariable indices ^org.nd4j.autodiff.samediff.SDVariable updates]
    (-> this (.scatterMul ref indices updates))))

(defn loss-mape
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.lossMAPE i-x i-y dimensions))))

(defn is-strictly-increasing
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.isStrictlyIncreasing i-x))))

(defn get-input-length
  "func - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `long`"
  (^Long [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable func]
    (-> this (.getInputLength func))))

(defn floor-mod
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y]
    (-> this (.floorMod x y))))

(defn norm-2
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Boolean keep-dims ^Integer dimensions]
    (-> this (.norm2 i-x keep-dims dimensions))))

(defn is-max
  "ix - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ix]
    (-> this (.isMax ix))))

(defn tan
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.tan i-x))))

(defn cos
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.cos i-x))))

(defn selu-derivative
  "arg - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable arg]
    (-> this (.seluDerivative arg))))

(defn merge-max
  "differential-functions - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-functions]
    (-> this (.mergeMax differential-functions))))

(defn scalar-max
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  num - `java.lang.Number`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^java.lang.Number num]
    (-> this (.scalarMax in num))))

(defn squared-difference
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (-> this (.squaredDifference differential-function i-v))))

(defn match-condition
  "Returns a boolean mask of equal shape to the input, where the condition is satisfied

  in - Input - `org.nd4j.autodiff.samediff.SDVariable`
  condition - Condition - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: Boolean mask - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.matchCondition in condition))))

(defn avg-pooling-3d
  "Avg pooling 3d operation.

  input - the inputs to pooling - `org.nd4j.autodiff.samediff.SDVariable`
  pooling-3-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig pooling-3-d-config]
    (-> this (.avgPooling3d input pooling-3-d-config))))

(defn and
  "ix - `org.nd4j.autodiff.samediff.SDVariable`
  iy - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ix ^org.nd4j.autodiff.samediff.SDVariable iy]
    (-> this (.and ix iy))))

(defn shannon-entropy
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.shannonEntropy in dimensions))))

(defn sequence-mask
  "lengths - `org.nd4j.autodiff.samediff.SDVariable`
  max-len - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable lengths ^org.nd4j.autodiff.samediff.SDVariable max-len]
    (-> this (.sequenceMask lengths max-len)))
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable lengths]
    (-> this (.sequenceMask lengths))))

(defn sigmoid-cross-entropy-with-logits
  "logits - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`
  labels - `org.nd4j.autodiff.samediff.SDVariable`
  reduction-mode - `int`
  label-smoothing - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable logits ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable labels ^Integer reduction-mode ^Double label-smoothing]
    (-> this (.sigmoidCrossEntropyWithLogits logits weights labels reduction-mode label-smoothing))))

(defn asum
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.asum in dimensions))))

(defn mul
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (-> this (.mul differential-function i-v))))

(defn strided-slice-bp
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  begin - `long[]`
  end - `long[]`
  strides - `long[]`
  begin-mask - `int`
  end-mask - `int`
  ellipsis-mask - `int`
  new-axis-mask - `int`
  shrink-axis-mask - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.autodiff.samediff.SDVariable grad begin end strides ^Integer begin-mask ^Integer end-mask ^Integer ellipsis-mask ^Integer new-axis-mask ^Integer shrink-axis-mask]
    (-> this (.stridedSliceBp in grad begin end strides begin-mask end-mask ellipsis-mask new-axis-mask shrink-axis-mask))))

(defn rsub
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (-> this (.rsub differential-function i-v))))

(defn local-response-normalization
  "Local response normalization operation.

  input - the inputs to lrn - `org.nd4j.autodiff.samediff.SDVariable`
  lrn-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.LocalResponseNormalizationConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.LocalResponseNormalizationConfig lrn-config]
    (-> this (.localResponseNormalization input lrn-config))))

(defn square
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.square i-x))))

(defn addi
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (-> this (.addi differential-function i-v))))

(defn div
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (-> this (.div differential-function i-v))))

(defn expand-dims
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  axis - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Integer axis]
    (-> this (.expandDims i-x axis))))

(defn loss-poisson
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.lossPoisson i-x i-y dimensions))))

(defn softmax
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.softmax i-x))))

(defn random-uniform
  "min - `double`
  max - `double`
  shape - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^Double min ^Double max ^org.nd4j.autodiff.samediff.SDVariable shape]
    (-> this (.randomUniform min max shape))))

(defn strided-slice
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  begin - `int[]`
  end - `int[]`
  strides - `int[]`
  begin-mask - `int`
  end-mask - `int`
  ellipsis-mask - `int`
  new-axis-mask - `int`
  shrink-axis-mask - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in begin end strides ^Integer begin-mask ^Integer end-mask ^Integer ellipsis-mask ^Integer new-axis-mask ^Integer shrink-axis-mask]
    (-> this (.stridedSlice in begin end strides begin-mask end-mask ellipsis-mask new-axis-mask shrink-axis-mask)))
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input begin end strides]
    (-> this (.stridedSlice input begin end strides))))

(defn abs
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.abs i-x))))

(defn one
  "shape - `int[]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this shape]
    (-> this (.one shape))))

(defn is-na-n
  "ix - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ix]
    (-> this (.isNaN ix))))

(defn avg-pooling-2d
  "Average pooling 2d operation.

  input - the inputs to pooling - `org.nd4j.autodiff.samediff.SDVariable`
  pooling-2-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig pooling-2-d-config]
    (-> this (.avgPooling2d input pooling-2-d-config))))

(defn loss-l-2
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.lossL2 i-x i-y dimensions))))

(defn count-zero
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^Integer dimensions]
    (-> this (.countZero input dimensions))))

(defn expm-1
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.expm1 i-x))))

(defn log-sum-exp
  "arg - `org.nd4j.autodiff.samediff.SDVariable`
  dimension - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable arg ^Integer dimension]
    (-> this (.logSumExp arg dimension))))

(defn relu
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  cutoff - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Double cutoff]
    (-> this (.relu i-x cutoff))))

(defn slice
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  begin - `int[]`
  size - `int[]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input begin size]
    (-> this (.slice input begin size))))

(defn same-diff
  "returns: `org.nd4j.autodiff.samediff.SameDiff`"
  (^org.nd4j.autodiff.samediff.SameDiff [^DifferentialFunctionFactory this]
    (-> this (.sameDiff))))

(defn clip-by-norm
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  clip-value - `double`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^Double clip-value ^Integer dimensions]
    (-> this (.clipByNorm x clip-value dimensions)))
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^Double clip-value]
    (-> this (.clipByNorm x clip-value))))

(defn merge-avg
  "differential-functions - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-functions]
    (-> this (.mergeAvg differential-functions))))

(defn lte
  "function-input - `org.nd4j.autodiff.samediff.SDVariable`
  function-input-1 - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable function-input ^org.nd4j.autodiff.samediff.SDVariable function-input-1]
    (-> this (.lte function-input function-input-1))))

(defn dilation-2-d
  "df - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`
  strides - `int[]`
  rates - `int[]`
  is-same-mode - `boolean`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable df ^org.nd4j.autodiff.samediff.SDVariable weights strides rates ^Boolean is-same-mode]
    (-> this (.dilation2D df weights strides rates is-same-mode))))

(defn is-finite
  "ix - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ix]
    (-> this (.isFinite ix))))

(defn tensor-mmul
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int[][]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y dimensions]
    (-> this (.tensorMmul x y dimensions))))

(defn segment-max
  "data - `org.nd4j.autodiff.samediff.SDVariable`
  segment-ids - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (-> this (.segmentMax data segment-ids))))

(defn max-bp
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable grad ^Boolean keep-dims ^Integer dimensions]
    (-> this (.maxBp i-x grad keep-dims dimensions))))

(defn add
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (-> this (.add differential-function i-v))))

(defn variance
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  bias-corrected - `boolean`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Boolean bias-corrected ^Boolean keep-dims ^Integer dimensions]
    (-> this (.variance i-x bias-corrected keep-dims dimensions))))

(defn amax
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.amax in dimensions))))

(defn all
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^Integer dimensions]
    (-> this (.all input dimensions))))

(defn loss-binary-xent
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.lossBinaryXENT i-x i-y dimensions))))

(defn atanh
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.atanh i-x))))

(defn size
  "in - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.size in))))

(defn segment-min
  "data - `org.nd4j.autodiff.samediff.SDVariable`
  segment-ids - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (-> this (.segmentMin data segment-ids))))

(defn amin
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.amin in dimensions))))

(defn dropout
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  p - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^Double p]
    (-> this (.dropout input p))))

(defn mean-bp
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.autodiff.samediff.SDVariable grad ^Boolean keep-dims ^Integer dimensions]
    (-> this (.meanBp in grad keep-dims dimensions))))

(defn upsampling-2d
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  nchw - `boolean`
  scale-h - `int`
  scale-w - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^Boolean nchw ^Integer scale-h ^Integer scale-w]
    (-> this (.upsampling2d input nchw scale-h scale-w))))

(defn floor-div-bp
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable grad]
    (-> this (.floorDivBp x y grad))))

(defn loss-negative-log-likelihood
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.lossNegativeLogLikelihood i-x i-y dimensions))))

(defn slice-bp
  "input - `org.nd4j.autodiff.samediff.SDVariable`
  gradient - `org.nd4j.autodiff.samediff.SDVariable`
  begin - `int[]`
  size - `int[]`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable gradient begin size]
    (-> this (.sliceBp input gradient begin size))))

(defn amean
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.amean in dimensions))))

(defn sinh
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.sinh i-x))))

(defn relu-6-derivative
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  wrt - `org.nd4j.autodiff.samediff.SDVariable`
  cutoff - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable wrt ^Double cutoff]
    (-> this (.relu6Derivative i-x wrt cutoff))))

(defn softplus
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.softplus i-x))))

(defn sub-bp
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable grad]
    (-> this (.subBp x y grad))))

(defn asinh
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.asinh i-x))))

(defn zero-fraction
  "input - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.zeroFraction input))))

(defn prod-bp
  "pre-reduce-input - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable pre-reduce-input ^org.nd4j.autodiff.samediff.SDVariable grad ^Boolean keep-dims ^Integer dimensions]
    (-> this (.prodBp pre-reduce-input grad keep-dims dimensions))))

(defn floor-mod-bp
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable grad]
    (-> this (.floorModBp x y grad))))

(defn mul-bp
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable grad]
    (-> this (.mulBp x y grad))))

(defn cumsum
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  exclusive - `boolean`
  reverse - `boolean`
  axis - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Boolean exclusive ^Boolean reverse ^Integer axis]
    (-> this (.cumsum in exclusive reverse axis))))

(defn rdiv
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (-> this (.rdiv differential-function i-v))))

(defn random-exponential
  "Exponential distribution: P(x) = lambda * exp(-lambda * x)

  lambda - Must be > 0 - `double`
  shape - Shape of the output - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^Double lambda ^org.nd4j.autodiff.samediff.SDVariable shape]
    (-> this (.randomExponential lambda shape))))

(defn round
  "ix - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ix]
    (-> this (.round ix))))

(defn sum-bp
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable grad ^Boolean keep-dims ^Integer dimensions]
    (-> this (.sumBp i-x grad keep-dims dimensions))))

(defn max-pooling-2d
  "Max pooling 2d operation.

  input - the inputs to pooling - `org.nd4j.autodiff.samediff.SDVariable`
  pooling-2-d-config - the configuration - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig pooling-2-d-config]
    (-> this (.maxPooling2d input pooling-2-d-config))))

(defn segment-prod
  "data - `org.nd4j.autodiff.samediff.SDVariable`
  segment-ids - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable data ^org.nd4j.autodiff.samediff.SDVariable segment-ids]
    (-> this (.segmentProd data segment-ids))))

(defn loss-squared-hinge
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.lossSquaredHinge i-x i-y dimensions))))

(defn gti
  "function-input - `org.nd4j.autodiff.samediff.SDVariable`
  function-input-1 - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable function-input ^org.nd4j.autodiff.samediff.SDVariable function-input-1]
    (-> this (.gti function-input function-input-1))))

(defn do-repeat
  "func - `org.nd4j.autodiff.samediff.SDVariable`
  input - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable func ^org.nd4j.autodiff.samediff.SDVariable input]
    (-> this (.doRepeat func input))))

(defn scalar-floor-mod
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  num - `java.lang.Number`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^java.lang.Number num]
    (-> this (.scalarFloorMod in num))))

(defn subi
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (-> this (.subi differential-function i-v))))

(defn asin
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.asin i-x))))

(defn sign
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.sign i-x))))

(defn get-reduction-length
  "func - `org.nd4j.autodiff.functions.DifferentialFunction`

  returns: `long`"
  (^Long [^DifferentialFunctionFactory this ^org.nd4j.autodiff.functions.DifferentialFunction func]
    (-> this (.getReductionLength func))))

(defn xor
  "ix - `org.nd4j.autodiff.samediff.SDVariable`
  iy - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable ix ^org.nd4j.autodiff.samediff.SDVariable iy]
    (-> this (.xor ix iy))))

(defn softmax-derivative
  "function-input - `org.nd4j.autodiff.samediff.SDVariable`
  wrt - `org.nd4j.autodiff.samediff.SDVariable`
  dimension - `java.lang.Integer`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable function-input ^org.nd4j.autodiff.samediff.SDVariable wrt ^java.lang.Integer dimension]
    (-> this (.softmaxDerivative function-input wrt dimension))))

(defn transpose
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.transpose i-x))))

(defn normmax
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  keep-dims - `boolean`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^Boolean keep-dims ^Integer dimensions]
    (-> this (.normmax i-x keep-dims dimensions))))

(defn tanh
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.tanh i-x))))

(defn weighted-cross-entropy-with-logits
  "targets - `org.nd4j.autodiff.samediff.SDVariable`
  inputs - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable targets ^org.nd4j.autodiff.samediff.SDVariable inputs ^org.nd4j.autodiff.samediff.SDVariable weights]
    (-> this (.weightedCrossEntropyWithLogits targets inputs weights))))

(defn swish
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.swish i-x))))

(defn log-sigmoid-derivative
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  wrt - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable wrt]
    (-> this (.logSigmoidDerivative i-x wrt))))

(defn manhattan-distance
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.manhattanDistance i-x i-y dimensions))))

(defn depth-to-space
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  blocks-size - `int`
  data-format - `java.lang.String`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^Integer blocks-size ^java.lang.String data-format]
    (-> this (.depthToSpace differential-function blocks-size data-format))))

(defn lti
  "function-input - `org.nd4j.autodiff.samediff.SDVariable`
  function-input-1 - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable function-input ^org.nd4j.autodiff.samediff.SDVariable function-input-1]
    (-> this (.lti function-input function-input-1))))

(defn tanh-rational
  "in - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.tanhRational in))))

(defn log-entropy
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Integer dimensions]
    (-> this (.logEntropy in dimensions))))

(defn stack
  "values - `org.nd4j.autodiff.samediff.SDVariable[]`
  axis - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this values ^Integer axis]
    (-> this (.stack values axis))))

(defn tanh-rectified-derivative
  "in - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in]
    (-> this (.tanhRectifiedDerivative in))))

(defn dynamic-partition
  "differential-function - `org.nd4j.autodiff.samediff.SDVariable`
  partitions - `org.nd4j.autodiff.samediff.SDVariable`
  num-partitions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable differential-function ^org.nd4j.autodiff.samediff.SDVariable partitions ^Integer num-partitions]
    (-> this (.dynamicPartition differential-function partitions num-partitions))))

(defn meshgrid
  "cartesian - `boolean`
  inputs - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^DifferentialFunctionFactory this ^Boolean cartesian ^org.nd4j.autodiff.samediff.SDVariable inputs]
    (-> this (.meshgrid cartesian inputs))))

(defn val
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.linalg.api.ops.impl.transforms.Constant`"
  (^org.nd4j.linalg.api.ops.impl.transforms.Constant [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.val i-x))))

(defn batch-norm
  "Batch norm operation.

  input - `org.nd4j.autodiff.samediff.SDVariable`
  mean - `org.nd4j.autodiff.samediff.SDVariable`
  variance - `org.nd4j.autodiff.samediff.SDVariable`
  gamma - `org.nd4j.autodiff.samediff.SDVariable`
  beta - `org.nd4j.autodiff.samediff.SDVariable`
  apply-gamma - `boolean`
  apply-beta - `boolean`
  epsilon - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable mean ^org.nd4j.autodiff.samediff.SDVariable variance ^org.nd4j.autodiff.samediff.SDVariable gamma ^org.nd4j.autodiff.samediff.SDVariable beta ^Boolean apply-gamma ^Boolean apply-beta ^Double epsilon]
    (-> this (.batchNorm input mean variance gamma beta apply-gamma apply-beta epsilon))))

(defn loss-mcxent
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.lossMCXENT i-x i-y dimensions))))

(defn step
  "in - `org.nd4j.autodiff.samediff.SDVariable`
  cutoff - `double`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable in ^Double cutoff]
    (-> this (.step in cutoff))))

(defn euclidean-distance
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`
  i-y - `org.nd4j.autodiff.samediff.SDVariable`
  dimensions - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x ^org.nd4j.autodiff.samediff.SDVariable i-y ^Integer dimensions]
    (-> this (.euclideanDistance i-x i-y dimensions))))

(defn acos
  "i-x - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable i-x]
    (-> this (.acos i-x))))

(defn rsub-bp
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  y - `org.nd4j.autodiff.samediff.SDVariable`
  grad - `org.nd4j.autodiff.samediff.SDVariable`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable y ^org.nd4j.autodiff.samediff.SDVariable grad]
    (-> this (.rsubBp x y grad))))

(defn random-log-normal
  "mean - `double`
  stdev - `double`
  shape - `long`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^Double mean ^Double stdev ^Long shape]
    (-> this (.randomLogNormal mean stdev shape))))

(defn reverse-sequence
  "x - `org.nd4j.autodiff.samediff.SDVariable`
  seq-lengths - `org.nd4j.autodiff.samediff.SDVariable`
  seq-dim - `int`
  batch-dim - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable seq-lengths ^Integer seq-dim ^Integer batch-dim]
    (-> this (.reverseSequence x seq-lengths seq-dim batch-dim)))
  (^org.nd4j.autodiff.samediff.SDVariable [^DifferentialFunctionFactory this ^org.nd4j.autodiff.samediff.SDVariable x ^org.nd4j.autodiff.samediff.SDVariable seq-lengths]
    (-> this (.reverseSequence x seq-lengths))))

