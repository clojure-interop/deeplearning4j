(ns org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners.checkpoint CheckpointListener$Builder]))

(defn ->builder
  "Constructor.

  root-dir - Root directory to save models to - `java.lang.String`"
  (^CheckpointListener$Builder [^java.lang.String root-dir]
    (new CheckpointListener$Builder root-dir)))

(defn log-saving
  "If true (the default) log a message every time a model is saved

  log-saving - Whether checkpoint saves should be logged or not - `boolean`

  returns: `org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder [^CheckpointListener$Builder this ^Boolean log-saving]
    (-> this (.logSaving log-saving))))

(defn save-every-n-epochs
  "Save a model at the end of every N epochs

  n - `int`

  returns: `org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder [^CheckpointListener$Builder this ^Integer n]
    (-> this (.saveEveryNEpochs n))))

(defn build
  "returns: `org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener`"
  (^org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener [^CheckpointListener$Builder this]
    (-> this (.build))))

(defn delete-existing
  "If the checkpoint listener is set to save to a non-empty directory, should the CheckpointListener-related
  content be deleted?
  This is disabled by default (and instead, an exception will be thrown if existing data is found)
  WARNING: Be careful when enabling this, as it deletes all saved checkpoint models in the specified directory!

  delete-existing - `boolean`

  returns: `org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder [^CheckpointListener$Builder this ^Boolean delete-existing]
    (-> this (.deleteExisting delete-existing))))

(defn keep-last
  "Keep only the last N most recent model checkpoint files. Older checkpoints will automatically be deleted.

  n - Number of most recent checkpoints to keep - `int`

  returns: `org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder [^CheckpointListener$Builder this ^Integer n]
    (-> this (.keepLast n))))

(defn keep-last-and-every
  "Keep the last N most recent model checkpoint files, and every M checkpoint files.
  For example: suppose you save every 100 iterations, for 2050 iteration, and use keepLastAndEvery(3,5).
  This means after 2050 iterations you would have saved 20 checkpoints - some of which will be deleted.
  Those remaining in this example: iterations 500, 1000, 1500, 1800, 1900, 2000.

  n-last - Most recent checkpoints to keep - `int`
  every-n - Every N checkpoints to keep (regardless of age) - `int`

  returns: `org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder [^CheckpointListener$Builder this ^Integer n-last ^Integer every-n]
    (-> this (.keepLastAndEvery n-last every-n))))

(defn keep-all
  "Keep all model checkpoints - i.e., don't delete any. Note that this is the default.

  returns: `org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder [^CheckpointListener$Builder this]
    (-> this (.keepAll))))

(defn save-every-epoch
  "Save a model at the end of every epoch

  returns: `org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder [^CheckpointListener$Builder this]
    (-> this (.saveEveryEpoch))))

(defn save-every-n-iterations
  "Save a model every N iterations (if sinceLast == false), or if N iterations have passed since
  the last model vas saved (if sinceLast == true)

  n - `int`
  since-last - `boolean`

  returns: `org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder [^CheckpointListener$Builder this ^Integer n ^Boolean since-last]
    (-> this (.saveEveryNIterations n since-last)))
  (^org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder [^CheckpointListener$Builder this ^Integer n]
    (-> this (.saveEveryNIterations n))))

(defn save-every
  "Save a model periodically (if sinceLast == false), or if the specified amount of time has elapsed since
  the last model was saved (if sinceLast == true)

  amount - Quantity of the specified time unit - `long`
  time-unit - Time unit - `java.util.concurrent.TimeUnit`
  since-last - `boolean`

  returns: `org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder [^CheckpointListener$Builder this ^Long amount ^java.util.concurrent.TimeUnit time-unit ^Boolean since-last]
    (-> this (.saveEvery amount time-unit since-last)))
  (^org.deeplearning4j.optimize.listeners.checkpoint.CheckpointListener$Builder [^CheckpointListener$Builder this ^Long amount ^java.util.concurrent.TimeUnit time-unit]
    (-> this (.saveEvery amount time-unit))))

