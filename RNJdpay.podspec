
Pod::Spec.new do |s|
  s.name         = "RNJdpay"
  s.version      = "1.4.0"
  s.summary      = "RNJdpay"
  s.description  = <<-DESC
                  RNJdpay
                   DESC
  s.homepage     = "https://github.com/fangasvsass/react-native-letote-jdpay"
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "9.0"
  s.source       = { :git => "https://github.com/fangasvsass/react-native-letote-jdpay.git", :tag => "master" }
  s.source_files  = "ios/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  