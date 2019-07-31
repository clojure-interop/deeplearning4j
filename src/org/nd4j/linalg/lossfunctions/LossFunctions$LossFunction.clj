(ns org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.lossfunctions LossFunctions$LossFunction]))

(def MSE
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/MSE)

(def L1
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/L1)

(def EXPLL
  "Enum Constant.

  Deprecated.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/EXPLL)

(def XENT
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/XENT)

(def MCXENT
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/MCXENT)

(def RMSE_XENT
  "Enum Constant.

  Deprecated.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/RMSE_XENT)

(def SQUARED_LOSS
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/SQUARED_LOSS)

(def RECONSTRUCTION_CROSSENTROPY
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/RECONSTRUCTION_CROSSENTROPY)

(def NEGATIVELOGLIKELIHOOD
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/NEGATIVELOGLIKELIHOOD)

(def CUSTOM
  "Enum Constant.

  Deprecated.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/CUSTOM)

(def COSINE_PROXIMITY
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/COSINE_PROXIMITY)

(def HINGE
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/HINGE)

(def SQUARED_HINGE
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/SQUARED_HINGE)

(def KL_DIVERGENCE
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/KL_DIVERGENCE)

(def MEAN_ABSOLUTE_ERROR
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/MEAN_ABSOLUTE_ERROR)

(def L2
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/L2)

(def MEAN_ABSOLUTE_PERCENTAGE_ERROR
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/MEAN_ABSOLUTE_PERCENTAGE_ERROR)

(def MEAN_SQUARED_LOGARITHMIC_ERROR
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/MEAN_SQUARED_LOGARITHMIC_ERROR)

(def POISSON
  "Enum Constant.

  type: org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction"
  LossFunctions$LossFunction/POISSON)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared. This method may be used to iterate
  over the constants as follows:


  for (LossFunctions.LossFunction c : LossFunctions.LossFunction.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction[]`"
  ([]
    (LossFunctions$LossFunction/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type. (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction [^java.lang.String name]
    (LossFunctions$LossFunction/valueOf name)))

(defn get-i-loss-function
  "returns: `org.nd4j.linalg.lossfunctions.ILossFunction`"
  (^org.nd4j.linalg.lossfunctions.ILossFunction [^LossFunctions$LossFunction this]
    (-> this (.getILossFunction))))

