import Foundation

@objc public class CapacitorHealthConnect: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
