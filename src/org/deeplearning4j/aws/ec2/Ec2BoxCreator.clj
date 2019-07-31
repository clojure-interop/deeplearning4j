(ns org.deeplearning4j.aws.ec2.Ec2BoxCreator
  "Creates Ec2Boxes"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.aws.ec2 Ec2BoxCreator]))

(defn ->ec-2-box-creator
  "Constructor.

  ami-id - amazon image id - `java.lang.String`
  num-boxes - number of boxes - `int`
  size - the size of the instances - `java.lang.String`
  security-group-id - `java.lang.String`
  key-pair - `java.lang.String`"
  (^Ec2BoxCreator [^java.lang.String ami-id ^Integer num-boxes ^java.lang.String size ^java.lang.String security-group-id ^java.lang.String key-pair]
    (new Ec2BoxCreator ami-id num-boxes size security-group-id key-pair))
  (^Ec2BoxCreator [^Integer num-boxes ^java.lang.String size ^java.lang.String security-group-id ^java.lang.String key-pair]
    (new Ec2BoxCreator num-boxes size security-group-id key-pair)))

(def *-default-ami
  "Static Constant.

  type: java.lang.String"
  Ec2BoxCreator/DEFAULT_AMI)

(defn create-spot
  ""
  ([^Ec2BoxCreator this]
    (-> this (.createSpot))))

(defn set-region
  "regions - `com.amazonaws.regions.Regions`"
  ([^Ec2BoxCreator this ^com.amazonaws.regions.Regions regions]
    (-> this (.setRegion regions))))

(defn create
  "Create the instances"
  ([^Ec2BoxCreator this]
    (-> this (.create))))

(defn blowup-boxes
  "returns: `java.util.List<com.amazonaws.services.ec2.model.InstanceStateChange>`"
  (^java.util.List [^Ec2BoxCreator this]
    (-> this (.blowupBoxes))))

(defn block-till-all-running
  ""
  ([^Ec2BoxCreator this]
    (-> this (.blockTillAllRunning))))

(defn all-running
  "returns: `boolean`"
  (^Boolean [^Ec2BoxCreator this]
    (-> this (.allRunning))))

(defn get-hosts
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Ec2BoxCreator this]
    (-> this (.getHosts))))

(defn get-boxes-created
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Ec2BoxCreator this]
    (-> this (.getBoxesCreated))))

