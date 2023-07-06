import requests
import unittest

class TestServer(unittest.TestCase):
    def test_logs(self):
        res = requests.get('http://localhost:8080/logs')
        self.assertEqual(res.status_code, 200)
        # Further checks on the format and content can be added

    def test_transaction(self):
        res = requests.get('http://localhost:8080/transaction')
        self.assertEqual(res.status_code, 200)
        # Check that a new log entry is created

if __name__ == "__main__":
    unittest.main()