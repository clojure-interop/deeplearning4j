(ns org.deeplearning4j.earlystopping.EarlyStoppingConfiguration$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping EarlyStoppingConfiguration$Builder]))

(defn ->builder
  "Constructor."
  (^EarlyStoppingConfiguration$Builder []
    (new EarlyStoppingConfiguration$Builder )))

(defn model-saver
  "How should models be saved? (Default: in memory)

  model-saver - `org.deeplearning4j.earlystopping.EarlyStoppingModelSaver`

  returns: `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration$Builder<T>`"
  (^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration$Builder [^EarlyStoppingConfiguration$Builder this ^org.deeplearning4j.earlystopping.EarlyStoppingModelSaver model-saver]
    (-> this (.modelSaver model-saver))))

(defn epoch-termination-conditions
  "Termination conditions to be evaluated every N epochs, with N set by evaluateEveryNEpochs option

  termination-conditions - `org.deeplearning4j.earlystopping.termination.EpochTerminationCondition`

  returns: `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration$Builder<T>`"
  (^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration$Builder [^EarlyStoppingConfiguration$Builder this ^org.deeplearning4j.earlystopping.termination.EpochTerminationCondition termination-conditions]
    (-> this (.epochTerminationConditions termination-conditions))))

(defn iteration-termination-conditions
  "Termination conditions to be evaluated every iteration (minibatch)

  termination-conditions - `org.deeplearning4j.earlystopping.termination.IterationTerminationCondition`

  returns: `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration$Builder<T>`"
  (^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration$Builder [^EarlyStoppingConfiguration$Builder this ^org.deeplearning4j.earlystopping.termination.IterationTerminationCondition termination-conditions]
    (-> this (.iterationTerminationConditions termination-conditions))))

(defn save-last-model
  "Save the last model? If true: save the most recent model at each epoch, in addition to the best
  model (whenever the best model improves). If false: only save the best model. Default: false
  Useful for example if you might want to continue training after a max-time terminatino condition
  occurs.

  save-last-model - `boolean`

  returns: `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration$Builder<T>`"
  (^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration$Builder [^EarlyStoppingConfiguration$Builder this ^Boolean save-last-model]
    (-> this (.saveLastModel save-last-model))))

(defn evaluate-every-n-epochs
  "How frequently should evaluations be conducted (in terms of epochs)? Defaults to every (1) epochs.

  every-n-epochs - `int`

  returns: `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration$Builder<T>`"
  (^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration$Builder [^EarlyStoppingConfiguration$Builder this ^Integer every-n-epochs]
    (-> this (.evaluateEveryNEpochs every-n-epochs))))

(defn score-calculator
  "Score calculator. Used to calculate a score (such as loss function on a test set), every N epochs,
  where N is set by evaluateEveryNEpochs

  score-calculator - `org.deeplearning4j.earlystopping.scorecalc.ScoreCalculator`

  returns: `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration$Builder<T>`"
  (^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration$Builder [^EarlyStoppingConfiguration$Builder this ^org.deeplearning4j.earlystopping.scorecalc.ScoreCalculator score-calculator]
    (-> this (.scoreCalculator score-calculator))))

(defn build
  "Create the early stopping configuration

  returns: `org.deeplearning4j.earlystopping.EarlyStoppingConfiguration<T>`"
  (^org.deeplearning4j.earlystopping.EarlyStoppingConfiguration [^EarlyStoppingConfiguration$Builder this]
    (-> this (.build))))

