(ns org.deeplearning4j.aws.emr.SparkEMRClient$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.aws.emr SparkEMRClient$Builder]))

(defn ->builder
  "Constructor."
  (^SparkEMRClient$Builder []
    (new SparkEMRClient$Builder )))

(defn subnet-id
  "The id of the EC2 subnet to be used for this Spark EMR service
  see https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html

  id - the subnet ID - `java.lang.String`

  returns: an EMR cluster builder - `org.deeplearning4j.aws.emr.SparkEMRClient$Builder`"
  (^org.deeplearning4j.aws.emr.SparkEMRClient$Builder [^SparkEMRClient$Builder this ^java.lang.String id]
    (-> this (.subnetId id))))

(defn emr-service-role
  "Defines the IAM role to be assumed by the EMR service

  https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-service.html

  service-role - the service role - `java.lang.String`

  returns: an EM cluster Builder - `org.deeplearning4j.aws.emr.SparkEMRClient$Builder`"
  (^org.deeplearning4j.aws.emr.SparkEMRClient$Builder [^SparkEMRClient$Builder this ^java.lang.String service-role]
    (-> this (.emrServiceRole service-role))))

(defn emr-release
  "Defines the EMR release version to be used in this cluster
  uses a release label
  See https://docs.aws.amazon.com/emr/latest/ReleaseGuide/emr-4.2.0/emr-release-differences.html#emr-release-label

  release-label - the EMR release label - `java.lang.String`

  returns: an EM cluster Builder - `org.deeplearning4j.aws.emr.SparkEMRClient$Builder`"
  (^org.deeplearning4j.aws.emr.SparkEMRClient$Builder [^SparkEMRClient$Builder this ^java.lang.String release-label]
    (-> this (.emrRelease release-label))))

(defn s-3-jar-folder
  "the S3 folder in which to find the application jar

  jarfolder - the S3 folder in which to find a jar - `java.lang.String`

  returns: an EMR cluster builder - `org.deeplearning4j.aws.emr.SparkEMRClient$Builder`"
  (^org.deeplearning4j.aws.emr.SparkEMRClient$Builder [^SparkEMRClient$Builder this ^java.lang.String jarfolder]
    (-> this (.s3JarFolder jarfolder))))

(defn instance-count
  "The number of instances this deployment should comprise of

  count - the number of instances for this cluster - `int`

  returns: `org.deeplearning4j.aws.emr.SparkEMRClient$Builder`"
  (^org.deeplearning4j.aws.emr.SparkEMRClient$Builder [^SparkEMRClient$Builder this ^Integer count]
    (-> this (.instanceCount count))))

(defn emr-configs
  "A list of configuration parameters to apply to EMR instances.

  configs - the EMR configurations to apply to this cluster - `java.util.List`

  returns: an EMR cluster builder - `org.deeplearning4j.aws.emr.SparkEMRClient$Builder`"
  (^org.deeplearning4j.aws.emr.SparkEMRClient$Builder [^SparkEMRClient$Builder this ^java.util.List configs]
    (-> this (.emrConfigs configs))))

(defn cluster-name
  "Defines the EMR cluster's name

  cluster-name - the EMR cluster's name - `java.lang.String`

  returns: an EMR cluster builder - `org.deeplearning4j.aws.emr.SparkEMRClient$Builder`"
  (^org.deeplearning4j.aws.emr.SparkEMRClient$Builder [^SparkEMRClient$Builder this ^java.lang.String cluster-name]
    (-> this (.clusterName cluster-name))))

(defn build
  "Creates an EMR Spark cluster deployment

  returns: a SparkEMRClient - `org.deeplearning4j.aws.emr.SparkEMRClient`"
  (^org.deeplearning4j.aws.emr.SparkEMRClient [^SparkEMRClient$Builder this]
    (-> this (.build))))

(defn aws-region
  "Defines the EMR cluster's region
  See https://docs.aws.amazon.com/general/latest/gr/rande.html

  region - the EMR cluster's region - `java.lang.String`

  returns: an EMR cluster builder - `org.deeplearning4j.aws.emr.SparkEMRClient$Builder`"
  (^org.deeplearning4j.aws.emr.SparkEMRClient$Builder [^SparkEMRClient$Builder this ^java.lang.String region]
    (-> this (.awsRegion region))))

(defn instance-type
  "The type of instance this cluster should comprise of
  See https://aws.amazon.com/ec2/instance-types/

  instance-type - the type of instance for this cluster - `java.lang.String`

  returns: an EMR cluster builder - `org.deeplearning4j.aws.emr.SparkEMRClient$Builder`"
  (^org.deeplearning4j.aws.emr.SparkEMRClient$Builder [^SparkEMRClient$Builder this ^java.lang.String instance-type]
    (-> this (.instanceType instance-type))))

(defn instance-bid-price
  "The optional bid value for this cluster's spot instances
  see https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-spot-instances-work.html
  Uses the on-demand market if empty.

  opt-bid - the Optional bid price for this cluster's instnces - `java.util.Optional`

  returns: an EMR cluster Builder - `org.deeplearning4j.aws.emr.SparkEMRClient$Builder`"
  (^org.deeplearning4j.aws.emr.SparkEMRClient$Builder [^SparkEMRClient$Builder this ^java.util.Optional opt-bid]
    (-> this (.instanceBidPrice opt-bid))))

(defn spark-time-out-duration-minutes
  "The timeout duration for this Spark EMR cluster, in minutes

  timeout-minutes - `int`

  returns: an EMR cluster builder - `org.deeplearning4j.aws.emr.SparkEMRClient$Builder`"
  (^org.deeplearning4j.aws.emr.SparkEMRClient$Builder [^SparkEMRClient$Builder this ^Integer timeout-minutes]
    (-> this (.sparkTimeOutDurationMinutes timeout-minutes))))

(defn instance-role
  "The EC2 instance role that this cluster's instances should assume
  see https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/iam-roles-for-amazon-ec2.html

  role - the intended instance role - `java.lang.String`

  returns: an EMR cluster builder - `org.deeplearning4j.aws.emr.SparkEMRClient$Builder`"
  (^org.deeplearning4j.aws.emr.SparkEMRClient$Builder [^SparkEMRClient$Builder this ^java.lang.String role]
    (-> this (.instanceRole role))))

(defn security-group-i-ds
  "The id of additional security groups this deployment should adopt for both master and slaves

  security-groups - `java.util.List`

  returns: an EMR cluster builder - `org.deeplearning4j.aws.emr.SparkEMRClient$Builder`"
  (^org.deeplearning4j.aws.emr.SparkEMRClient$Builder [^SparkEMRClient$Builder this ^java.util.List security-groups]
    (-> this (.securityGroupIDs security-groups))))

