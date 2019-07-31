(ns org.nd4j.linalg.ops.transforms.Transforms
  "Functional interface for the different op classes"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.ops.transforms Transforms]))

(defn *hamming-distance
  "d-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  d-2 - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^org.nd4j.linalg.api.ndarray.INDArray d-1 ^org.nd4j.linalg.api.ndarray.INDArray d-2]
    (Transforms/hammingDistance d-1 d-2)))

(defn *softsign-derivative
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/softsignDerivative in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Transforms/softsignDerivative arr)))

(defn *floor
  "Floor function

  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/floor nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/floor nd-array)))

(defn *log-1p
  "Log of x  1 function

  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/log1p nd-array dup)))

(defn *ceil
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/ceil in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Transforms/ceil arr)))

(defn *cosh
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/cosh in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in]
    (Transforms/cosh in)))

(defn *sigmoid-derivative
  "Sigmoid function

  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/sigmoidDerivative nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/sigmoidDerivative nd-array)))

(defn *min
  "Minimum function with a scalar

  nd-array - tbe ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  k - `double`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Double k ^Boolean dup]
    (Transforms/min nd-array k dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Double k]
    (Transforms/min nd-array k)))

(defn *elu-derivative
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/eluDerivative in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Transforms/eluDerivative arr)))

(defn *stabilize
  "Stabilize to be within a range of k

  nd-array - tbe ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  k - `double`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Double k ^Boolean dup]
    (Transforms/stabilize nd-array k dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Double k]
    (Transforms/stabilize nd-array k)))

(defn *hard-tanh
  "Hard tanh

  nd-array - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - whether to duplicate the ndarray and return it as the result - `boolean`

  returns: the output - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/hardTanh nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/hardTanh nd-array)))

(defn *jaccard-distance
  "d-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  d-2 - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^org.nd4j.linalg.api.ndarray.INDArray d-1 ^org.nd4j.linalg.api.ndarray.INDArray d-2]
    (Transforms/jaccardDistance d-1 d-2)))

(defn *all-cosine-similarities
  "d-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  d-2 - `org.nd4j.linalg.api.ndarray.INDArray`
  dimensions - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray d-1 ^org.nd4j.linalg.api.ndarray.INDArray d-2 ^Integer dimensions]
    (Transforms/allCosineSimilarities d-1 d-2 dimensions)))

(defn *soft-plus
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/softPlus in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Transforms/softPlus arr)))

(defn *cosine-distance
  "d-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  d-2 - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^org.nd4j.linalg.api.ndarray.INDArray d-1 ^org.nd4j.linalg.api.ndarray.INDArray d-2]
    (Transforms/cosineDistance d-1 d-2)))

(defn *relu-6
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/relu6 in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Transforms/relu6 arr)))

(defn *leaky-relu
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  cutoff - `double`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Double cutoff ^Boolean copy]
    (Transforms/leakyRelu in cutoff copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/leakyRelu in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Transforms/leakyRelu arr)))

(defn *not
  "x - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray x]
    (Transforms/not x)))

(defn *atan-2
  "Atan2 operation, new INDArray instance will be returned
  Note the order of x and y parameters is opposite to that of java.lang.Math.atan2

  x - the abscissa coordinate - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the ordinate coordinate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the theta from point (r, theta) when converting (x,y) from to cartesian to polar coordinates - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (Transforms/atan2 x y)))

(defn *reverse
  "x - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray x ^Boolean dup]
    (Transforms/reverse x dup)))

(defn *elu
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/elu in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Transforms/elu arr)))

(defn *max
  "Maximum function with a scalar

  nd-array - tbe ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  k - `double`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Double k ^Boolean dup]
    (Transforms/max nd-array k dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Double k]
    (Transforms/max nd-array k)))

(defn *sigmoid
  "Sigmoid function

  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/sigmoid nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/sigmoid nd-array)))

(defn *normalize-zero-mean-and-unit-variance
  "Normalize data to zero mean and unit variance
  substract by the mean and divide by the standard deviation

  to-normalize - the ndarray to normalize - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the normalized ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray to-normalize]
    (Transforms/normalizeZeroMeanAndUnitVariance to-normalize)))

(defn *pow
  "Element-wise power function - x^y, performed element-wise

  nd-array - the ndarray to raise to the power of - `org.nd4j.linalg.api.ndarray.INDArray`
  power - the power to raise by - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - if true: - `boolean`

  returns: the ndarray raised to this power - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^org.nd4j.linalg.api.ndarray.INDArray power ^Boolean dup]
    (Transforms/pow nd-array power dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^java.lang.Number power]
    (Transforms/pow nd-array power)))

(defn *eps
  "Eps function

  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/eps nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/eps nd-array)))

(defn *atan
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/atan in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Transforms/atan arr)))

(defn *log
  "Log on arbitrary base

  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  base - `double`
  duplicate - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Double base ^Boolean duplicate]
    (Transforms/log nd-array base duplicate))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Double base]
    (Transforms/log nd-array base))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/log nd-array)))

(defn *all-euclidean-distances
  "d-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  d-2 - `org.nd4j.linalg.api.ndarray.INDArray`
  dimensions - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray d-1 ^org.nd4j.linalg.api.ndarray.INDArray d-2 ^Integer dimensions]
    (Transforms/allEuclideanDistances d-1 d-2 dimensions)))

(defn *hard-tanh-derivative
  "Hard tanh

  nd-array - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - whether to duplicate the ndarray and return it as the result - `boolean`

  returns: the output - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/hardTanhDerivative nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/hardTanhDerivative nd-array)))

(defn *unit-vec
  "Scale by 1 / norm2 of the matrix

  to-scale - the ndarray to scale - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the scaled ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray to-scale]
    (Transforms/unitVec to-scale)))

(defn *all-cosine-distances
  "d-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  d-2 - `org.nd4j.linalg.api.ndarray.INDArray`
  dimensions - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray d-1 ^org.nd4j.linalg.api.ndarray.INDArray d-2 ^Integer dimensions]
    (Transforms/allCosineDistances d-1 d-2 dimensions)))

(defn *sin
  "Sin function

  in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/sin in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in]
    (Transforms/sin in)))

(defn *exp
  "Exp function

  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/exp nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/exp nd-array)))

(defn *leaky-relu-derivative
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  cutoff - `double`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Double cutoff ^Boolean copy]
    (Transforms/leakyReluDerivative in cutoff copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr ^Double cutoff]
    (Transforms/leakyReluDerivative arr cutoff)))

(defn *or
  "x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (Transforms/or x y)))

(defn *identity
  "Identity function

  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/identity nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/identity nd-array)))

(defn *neg
  "Negative

  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/neg nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/neg nd-array)))

(defn *softsign
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/softsign in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Transforms/softsign arr)))

(defn *sqrt
  "Sqrt function

  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/sqrt nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/sqrt nd-array)))

(defn *tan
  "Element-wise tan function. Copies the array

  nd-array - Input array - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/tan nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/tan nd-array)))

(defn *cos
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/cos in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in]
    (Transforms/cos in)))

(defn *and
  "x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (Transforms/and x y)))

(defn *greater-than-or-equal
  "Eps function

  first - `org.nd4j.linalg.api.ndarray.INDArray`
  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray first ^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/greaterThanOrEqual first nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray first ^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/greaterThanOrEqual first nd-array)))

(defn *softmax
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/softmax in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Transforms/softmax arr)))

(defn *abs
  "Abs function

  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/abs nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/abs nd-array)))

(defn *expm-1
  "Elementwise exponential - 1 function

  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/expm1 nd-array dup)))

(defn *relu
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/relu in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Transforms/relu arr)))

(defn *cosine-sim
  "Cosine similarity

  d-1 - the first vector - `org.nd4j.linalg.api.ndarray.INDArray`
  d-2 - the second vector - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the cosine similarities between the 2 arrays - `double`"
  (^Double [^org.nd4j.linalg.api.ndarray.INDArray d-1 ^org.nd4j.linalg.api.ndarray.INDArray d-2]
    (Transforms/cosineSim d-1 d-2)))

(defn *all-manhattan-distances
  "d-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  d-2 - `org.nd4j.linalg.api.ndarray.INDArray`
  dimensions - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray d-1 ^org.nd4j.linalg.api.ndarray.INDArray d-2 ^Integer dimensions]
    (Transforms/allManhattanDistances d-1 d-2 dimensions)))

(defn *atanh
  "Sin function

  in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/atanh in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in]
    (Transforms/atanh in)))

(defn *less-than-or-equal
  "Eps function

  first - `org.nd4j.linalg.api.ndarray.INDArray`
  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray first ^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/lessThanOrEqual first nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray first ^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/lessThanOrEqual first nd-array)))

(defn *mpow
  "Raises a square matrix to a power n, which can be positive, negative, or zero.
  The behavior is similar to the numpy matrix_power() function. The algorithm uses
  repeated squarings to minimize the number of mmul() operations needed
  If n is zero, the identity matrix is returned.
  If n is negative, the matrix is inverted and raised to the abs(n) power.

  in - A square matrix to raise to an integer power, which will be changed if dup is false. - `org.nd4j.linalg.api.ndarray.INDArray`
  n - The integer power to raise the matrix to. - `int`
  dup - If dup is true, the original input is unchanged. - `boolean`

  returns: The result of raising in to the nth power. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Integer n ^Boolean dup]
    (Transforms/mpow in n dup)))

(defn *ceiling
  "Ceiling function

  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  copy-on-ops - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean copy-on-ops]
    (Transforms/ceiling nd-array copy-on-ops))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/ceiling nd-array)))

(defn *sinh
  "Sinh function

  in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/sinh in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in]
    (Transforms/sinh in)))

(defn *round
  "Rounding function

  nd-array - the ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/round nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/round nd-array)))

(defn *asin
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/asin in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Transforms/asin arr)))

(defn *sign
  "Signum function of this ndarray

  to-sign - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray to-sign ^Boolean dup]
    (Transforms/sign to-sign dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray to-sign]
    (Transforms/sign to-sign)))

(defn *xor
  "x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (Transforms/xor x y)))

(defn *tanh
  "Tanh function

  nd-array - `org.nd4j.linalg.api.ndarray.INDArray`
  dup - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^Boolean dup]
    (Transforms/tanh nd-array dup))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray nd-array]
    (Transforms/tanh nd-array)))

(defn *manhattan-distance
  "d-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  d-2 - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^org.nd4j.linalg.api.ndarray.INDArray d-1 ^org.nd4j.linalg.api.ndarray.INDArray d-2]
    (Transforms/manhattanDistance d-1 d-2)))

(defn *step
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/step in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Transforms/step arr)))

(defn *euclidean-distance
  "d-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  d-2 - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^org.nd4j.linalg.api.ndarray.INDArray d-1 ^org.nd4j.linalg.api.ndarray.INDArray d-2]
    (Transforms/euclideanDistance d-1 d-2)))

(defn *acos
  "in - `org.nd4j.linalg.api.ndarray.INDArray`
  copy - `boolean`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean copy]
    (Transforms/acos in copy))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Transforms/acos arr)))

