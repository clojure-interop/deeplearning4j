(ns org.nd4j.autodiff.loss.LossFunctions$Reduction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.loss LossFunctions$Reduction]))

(def NONE
  "Enum Constant.

  No reduction. Output is the same shape as the predictions/labels.
  Weights (if any) are applied. Dimension args are ignored.
  Example: 2d input, MSE.
  Output: sqDiff(predictions,labels) -> shape same as input/labels

  type: org.nd4j.autodiff.loss.LossFunctions$Reduction"
  LossFunctions$Reduction/NONE)

(def SPECIFIED_DIMS
  "Enum Constant.

  Reduce as normal along the specified dimensions, but don't sum/mean etc the remaining
  dimensions.
  Example: 2d input, MSE loss along dimension 1.
  Output: mean(weights * sqDiff(predictions,labels),1) -> shape [dim0,1]

  type: org.nd4j.autodiff.loss.LossFunctions$Reduction"
  LossFunctions$Reduction/SPECIFIED_DIMS)

(def SUM
  "Enum Constant.

  Sum across the remaining dimensions, returning a scalar
  Example: 2d input, MSE loss along dimension 1.
  Output: mse_per_ex = mean(weights * sqDiff(predictions,labels),1) *Same as SPECIFIED_DIMS*
  output = sum(mse_per_ex)

  type: org.nd4j.autodiff.loss.LossFunctions$Reduction"
  LossFunctions$Reduction/SUM)

(def MEAN_BY_WEIGHT
  "Enum Constant.

  Weighted mean: sum(weights * loss) / sum(weights)
  Example: 2d input, MSE loss along dimension 1.
  Output: mse_per_ex = mean(weights * sqDiff(predictions,labels),1) *Same as SPECIFIED_DIMS*
  output = sum(mse_per_ex) / sum(weights)
  NOTE: if weights array is not provided, then weights default to (effectively) 1.0 for all entries - and hence
  MEAN_BY_WEIGHT is equivalent to SUM (as sum(1.0) = 1.0)

  type: org.nd4j.autodiff.loss.LossFunctions$Reduction"
  LossFunctions$Reduction/MEAN_BY_WEIGHT)

(def MEAN_BY_COUNT
  "Enum Constant.

  Weighted mean: sum(weights * loss) / count(weights != 0)
  Example: 2d input, MSE loss along dimension 1.
  Output: mse_per_ex = mean(weights * sqDiff(predictions,labels),1) *Same as SPECIFIED_DIMS*
  output = sum(mse_per_ex) / count(weights != 0)
  NOTE: if weights array is not provided, then weights default to scalar 1.0 and hence MEAN_BY_COUNT
  is equivalent to

  type: org.nd4j.autodiff.loss.LossFunctions$Reduction"
  LossFunctions$Reduction/MEAN_BY_COUNT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (LossFunctions.Reduction c : LossFunctions.Reduction.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.autodiff.loss.LossFunctions$Reduction[]`"
  ([]
    (LossFunctions$Reduction/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.autodiff.loss.LossFunctions$Reduction`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.autodiff.loss.LossFunctions$Reduction [^java.lang.String name]
    (LossFunctions$Reduction/valueOf name)))

