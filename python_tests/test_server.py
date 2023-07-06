import requests
import unittest

class TestServer(unittest.TestCase):
    def test_logs(self):
        res = requests.get('http://localhost:8080/logs')
        self.assertEqual(res.status_code, 200, 'logs endpoint should return 200')
        self.assertEqual(res.headers.get('Content-Type'), 'application/json', 'logs endpoint should return JSON')
        # add specific assertions for the content of the response

    def test_transaction(self):
        initial_res = requests.get('http://localhost:8080/logs')
        initial_logs_count = len(initial_res.json())

        res = requests.get('http://localhost:8080/transaction')
        self.assertEqual(res.status_code, 200, 'transaction endpoint should return 200')
        self.assertEqual(res.text, 'A new transaction has been created.', 'transaction endpoint should return a success message')

        final_res = requests.get('http://localhost:8080/logs')
        final_logs_count = len(final_res.json())
        self.assertEqual(final_logs_count, initial_logs_count + 1, 'transaction endpoint should create a new log')

    def test_wrong_endpoint(self):
        res = requests.get('http://localhost:8080/non_existent_endpoint')
        self.assertEqual(res.status_code, 404, 'non-existent endpoint should return 404')

if __name__ == "__main__":
    unittest.main()