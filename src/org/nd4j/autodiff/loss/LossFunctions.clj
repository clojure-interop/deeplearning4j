(ns org.nd4j.autodiff.loss.LossFunctions
  "SameDiff loss functions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.loss LossFunctions]))

(defn *mse
  "Mean squared error: L = mean( (predicted - label)^2)

  output-name - Name of the output SDVariable - `java.lang.String`
  predictions - Predictions variable - `org.nd4j.autodiff.samediff.SDVariable`
  label - Label variable - `org.nd4j.autodiff.samediff.SDVariable`
  weights - Weights array. May be null, or any broadcastable shape (with predictions/label arrays).Note that this is also used for masking (weight of 0 = 'masked out') - `org.nd4j.autodiff.samediff.SDVariable`
  reduction - Type of reduction to perform for the loss function - `org.nd4j.autodiff.loss.LossFunctions$Reduction`
  dimensions - Dimension(s) to apply the loss function on - `int`

  returns: LossInfo - bean with variables etc for the loss function - `org.nd4j.autodiff.loss.LossInfo`"
  (^org.nd4j.autodiff.loss.LossInfo [^java.lang.String output-name ^org.nd4j.autodiff.samediff.SDVariable predictions ^org.nd4j.autodiff.samediff.SDVariable label ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.loss.LossFunctions$Reduction reduction ^Integer dimensions]
    (LossFunctions/mse output-name predictions label weights reduction dimensions)))

(defn *l-1
  "L1 loss - sum of absolute errors. L = sum_i abs(predicted_i - actual_i)

  output-name - `java.lang.String`
  predictions - `org.nd4j.autodiff.samediff.SDVariable`
  label - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`
  reduction - `org.nd4j.autodiff.loss.LossFunctions$Reduction`
  dimensions - `int`

  returns: `org.nd4j.autodiff.loss.LossInfo`"
  (^org.nd4j.autodiff.loss.LossInfo [^java.lang.String output-name ^org.nd4j.autodiff.samediff.SDVariable predictions ^org.nd4j.autodiff.samediff.SDVariable label ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.loss.LossFunctions$Reduction reduction ^Integer dimensions]
    (LossFunctions/l1 output-name predictions label weights reduction dimensions)))

(defn *l-2
  "L2 loss function: i.e., sum of squared errors, L = sum_i (actual_i - predicted)^2

  output-name - `java.lang.String`
  predictions - `org.nd4j.autodiff.samediff.SDVariable`
  label - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`
  reduction - `org.nd4j.autodiff.loss.LossFunctions$Reduction`
  dimensions - `int`

  returns: `org.nd4j.autodiff.loss.LossInfo`"
  (^org.nd4j.autodiff.loss.LossInfo [^java.lang.String output-name ^org.nd4j.autodiff.samediff.SDVariable predictions ^org.nd4j.autodiff.samediff.SDVariable label ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.loss.LossFunctions$Reduction reduction ^Integer dimensions]
    (LossFunctions/l2 output-name predictions label weights reduction dimensions)))

(defn *negative-log-likelihood
  "output-name - `java.lang.String`
  predictions - `org.nd4j.autodiff.samediff.SDVariable`
  label - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`
  reduction - `org.nd4j.autodiff.loss.LossFunctions$Reduction`
  dimensions - `int`

  returns: `org.nd4j.autodiff.loss.LossInfo`"
  (^org.nd4j.autodiff.loss.LossInfo [^java.lang.String output-name ^org.nd4j.autodiff.samediff.SDVariable predictions ^org.nd4j.autodiff.samediff.SDVariable label ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.loss.LossFunctions$Reduction reduction ^Integer dimensions]
    (LossFunctions/negativeLogLikelihood output-name predictions label weights reduction dimensions)))

(defn *mcxent
  "Multi-Class Cross Entropy loss function:
  L = sum_i actual_i * log( predicted_i )

  output-name - `java.lang.String`
  predictions - `org.nd4j.autodiff.samediff.SDVariable`
  label - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`
  reduction - `org.nd4j.autodiff.loss.LossFunctions$Reduction`
  dimensions - `int`

  returns: `org.nd4j.autodiff.loss.LossInfo`"
  (^org.nd4j.autodiff.loss.LossInfo [^java.lang.String output-name ^org.nd4j.autodiff.samediff.SDVariable predictions ^org.nd4j.autodiff.samediff.SDVariable label ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.loss.LossFunctions$Reduction reduction ^Integer dimensions]
    (LossFunctions/mcxent output-name predictions label weights reduction dimensions)))

